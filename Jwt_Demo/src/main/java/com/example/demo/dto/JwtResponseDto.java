package com.example.demo.dto;

public class JwtResponseDto {

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "JwtResponseDto [token=" + token + "]";
	}

	public JwtResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JwtResponseDto(String token) {
		super();
		this.token = token;
	}
	
	
}
