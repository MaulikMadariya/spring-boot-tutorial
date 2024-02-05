package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.State;

public interface StateService {
	ResponseDto addState(State state , ResponseDto dto);
	
	List<State> showState();
	
	void updateState(Integer countryId , Integer... stateId);
}
