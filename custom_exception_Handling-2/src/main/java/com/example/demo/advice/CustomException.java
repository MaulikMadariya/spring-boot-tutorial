package com.example.demo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.exception.EmployeeNotFoundById;

@RestControllerAdvice
public class CustomException {

	@ExceptionHandler(EmployeeNotFoundById.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public EmployeeResponseDto EmployeeNotFoundById(EmployeeNotFoundById ex)
	{
		return new EmployeeResponseDto(500,ex.getMessage(),"Error");
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public EmployeeResponseDto EmployeeNotFoundById1(NumberFormatException ex)
	{
		return new EmployeeResponseDto(400,"Invalid Input "+ex.getMessage(),"Error");
	}	
}
