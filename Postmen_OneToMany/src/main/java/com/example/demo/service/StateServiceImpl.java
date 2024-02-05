package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.State;
import com.example.demo.repository.StateRepo;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepo stateRepo;

	@Override
	public ResponseDto addState(State state, ResponseDto dto) {
		stateRepo.save(state);

		dto.setMessage("Sucess");
		dto.setStatus(200);
		dto.setData("State Added.....");
		return dto;
	}

}
