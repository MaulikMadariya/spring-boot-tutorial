package com.example.demo.exception;

public class carNotFindById extends RuntimeException{

	public carNotFindById(String message)
	{
		super(message);
	}
}
