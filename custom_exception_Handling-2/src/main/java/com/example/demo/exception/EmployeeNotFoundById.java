package com.example.demo.exception;



public class EmployeeNotFoundById extends RuntimeException{


	
	public EmployeeNotFoundById(String message)
	{
		super(message);
	}

	
}
