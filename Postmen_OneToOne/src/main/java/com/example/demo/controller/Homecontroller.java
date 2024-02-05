package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Intern;
import com.example.demo.service.InternService;

@Controller
@RequestMapping("/intern")
public class Homecontroller {

	@Autowired
	private InternService internService;
	
	@PostMapping("/updateByManager/{internId}/{managerId}")
	@ResponseBody
	public ResponseDto save(@PathVariable("internId") Integer internId , @PathVariable("managerId") Integer managerId , ResponseDto dto)
	{
		internService.save(internId, managerId,dto);
		return dto;
	}
}

