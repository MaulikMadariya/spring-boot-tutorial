package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.State;
import com.example.demo.service.StateService;

@Controller
@RequestMapping("/state")
public class StateController {

	@Autowired
	private StateService stateService;

	@ResponseBody
	@PostMapping("/addState")
	public ResponseDto addState(@RequestBody State state, ResponseDto dto) {
		stateService.addState(state, dto);
		return dto;
	}
}
