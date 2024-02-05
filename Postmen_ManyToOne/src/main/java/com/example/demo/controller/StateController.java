package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Country;
import com.example.demo.model.State;
import com.example.demo.service.StateService;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@Controller
@RequestMapping("/state")
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	@PostMapping("/addState")
	@ResponseBody
	public ResponseDto addState(@RequestBody State state , ResponseDto dto)
	{
		stateService.addState(state, dto);
		return dto;
	}
	
	@GetMapping("/showState")
	@ResponseBody
	public List<State> showState()
	{
	
		List<State> states =  stateService.showState();
		return states;
		
	}
	
	@PutMapping("/updateState")
	@ResponseBody
	public void updateState(@RequestParam("countryId") Integer countryId, @RequestParam("stateId") Integer... stateId )
	{
		stateService.updateState(countryId ,stateId);
		
	}
	
	
	
}
