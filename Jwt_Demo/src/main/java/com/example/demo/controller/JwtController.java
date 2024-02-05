package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.JwtRequestDto;
import com.example.demo.dto.JwtResponseDto;
import com.example.demo.jwt.JwtUtil;
import com.example.demo.service.CustomUserDetailService;

@RestController
public class JwtController 
{

	@Autowired
	private CustomUserDetailService customUserDetailService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@RequestMapping(value = "/	token" ,method = RequestMethod.POST)
	public ResponseEntity<?> generateToken(@RequestBody JwtRequestDto jwtRequestDto) throws Exception
	{ 
		System.err.println(jwtRequestDto);
		try
		{
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequestDto.getUsername(), jwtRequestDto.getPassword()));
		}
		catch (UsernameNotFoundException exception) {
			exception.printStackTrace();
			throw new Exception("User Not Found");
		}


		
		UserDetails userByUsername = this.customUserDetailService.loadUserByUsername(jwtRequestDto.getUsername());
		String token = this.jwtUtil.generateToken(userByUsername.getUsername());
		return ResponseEntity.ok(new JwtResponseDto(token));	
	}
	
}
