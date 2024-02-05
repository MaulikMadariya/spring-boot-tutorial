package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.ResponseDto;

@RestControllerAdvice
public class CustomException {
	
	@ExceptionHandler(carNotFoundById.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseDto exception(carNotFoundById ex)
	{
		ResponseDto dto = new ResponseDto();
		dto.setMessage("error");
		dto.setStatus(500);
		dto.setData(ex.getMessage());
		return dto;
	}
}
