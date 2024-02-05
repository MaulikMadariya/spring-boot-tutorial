package com.example.demo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.responseDto;
import com.example.demo.exception.StudentNotFoundById;

@RestControllerAdvice
public class customException {

	@ExceptionHandler(StudentNotFoundById.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public responseDto notFound(StudentNotFoundById st)
	{
		return new responseDto(404,"Error",st.getMessage());
	}
	
}
