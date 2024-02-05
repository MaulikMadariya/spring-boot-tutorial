package com.example.demo.exception;

public class carNotFoundById extends RuntimeException {
	
	public carNotFoundById(String message)
	{
		super(message);
	}
	public carNotFoundById() {
		}
}
