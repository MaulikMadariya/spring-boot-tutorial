package com.example.demo.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.jwt.JwtUtil;
import com.example.demo.service.CustomUserDetailService;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private CustomUserDetailService customUserDetailService;

	@Autowired
	private JwtUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String header = request.getHeader("Authorization");

//		System.err.println(header);
		String userName = null;
		String jwtToken = null;

		if (header != null && header.startsWith("Bearer ")) {
			jwtToken = header.substring(7);

			try {
				userName = jwtUtil.extractUsername(jwtToken);
				System.out.println("Hello world");
				System.err.println("UserName" + userName);
				System.out.println("Hello world");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			UserDetails userByUsername = this.customUserDetailService.loadUserByUsername(userName);
			System.err.println("This" + userByUsername);
			if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						userByUsername, null, userByUsername.getAuthorities());

				usernamePasswordAuthenticationToken
						.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
//			if (jwtUtil.isTokenValid(jwtToken, userByUsername	)) {
//				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userByUsername, null, userByUsername.getAuthorities());
//				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//			}
		}
		filterChain.doFilter(request, response);
	}		
}
