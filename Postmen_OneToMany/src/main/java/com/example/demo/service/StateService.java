package com.example.demo.service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.State;

public interface StateService {
	
	public ResponseDto addState(State state , ResponseDto dto);
}
