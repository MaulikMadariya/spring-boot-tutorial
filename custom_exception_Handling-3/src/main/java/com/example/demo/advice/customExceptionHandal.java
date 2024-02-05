package com.example.demo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.ResponseDto;
import com.example.demo.exception.carNotFindById;

@RestControllerAdvice
public class customExceptionHandal {

	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(carNotFindById.class)
	public ResponseDto custom(carNotFindById ex)
	{
		return new ResponseDto(500,"Error",ex.getMessage());
	}
}
