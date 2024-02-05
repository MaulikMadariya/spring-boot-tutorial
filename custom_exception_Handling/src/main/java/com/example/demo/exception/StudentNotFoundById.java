package com.example.demo.exception;


public class StudentNotFoundById extends RuntimeException{

	public StudentNotFoundById() {
		
		
	}
	
	public StudentNotFoundById(String message) {
		super(message);
		
	}
}
