package com.example.demo.configue;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler{

	 SimpleUrlAuthenticationSuccessHandler userSuccessHandler =
	            new SimpleUrlAuthenticationSuccessHandler("/student/user");
	    SimpleUrlAuthenticationSuccessHandler adminSuccessHandler =
	            new SimpleUrlAuthenticationSuccessHandler("/student/admin");

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (final GrantedAuthority grantedAuthority : authorities) {
            String authorityName = grantedAuthority.getAuthority();
            
            if (authorityName.equals("admin")) {
                // if the user is an ADMIN delegate to the adminSuccessHandler
                this.adminSuccessHandler.onAuthenticationSuccess(request, response, authentication);
                return;
            }
            
	}
        this.userSuccessHandler.onAuthenticationSuccess(request, response, authentication);
	}
}
