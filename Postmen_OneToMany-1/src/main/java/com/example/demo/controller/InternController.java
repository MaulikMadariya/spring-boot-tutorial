package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Intern;
import com.example.demo.service.InternService;

@RestController
@RequestMapping("/intern")
public class InternController {

	@Autowired
	private InternService internService;
	
	@PostMapping("/addIntern")
	public ResponseDto addIntern(@RequestBody Intern intern , ResponseDto dto)
	{
		internService.addIntern(intern,dto);
		return dto;
	}
	
	@GetMapping("/showSalary")
	public ResponseDto internSalary(@RequestParam("iSalary") Integer internSalary , ResponseDto dto)
	{
		internService.dispSalary(internSalary, dto);
		return dto;
	}
}
