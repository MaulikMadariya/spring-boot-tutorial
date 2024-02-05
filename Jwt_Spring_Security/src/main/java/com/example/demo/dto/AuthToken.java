package com.example.demo.dto;

public class AuthToken {
    private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "AuthToken [token=" + token + "]";
	}

	public AuthToken(String token) {
		super();
		this.token = token;
	}

	public AuthToken() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
