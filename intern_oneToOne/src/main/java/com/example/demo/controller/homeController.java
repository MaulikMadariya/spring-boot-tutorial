package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.internDto;
import com.example.demo.model.Intern;
import com.example.demo.service.internService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/intern")
public class homeController {

	@Autowired
	private internService service;

	@PostMapping("/internAdd")
	@ResponseBody
	public ResponseEntity<String> internAdd(@RequestBody Intern intern)
	{
		service.save(intern);
		return new ResponseEntity<>("Intern Added...",HttpStatus.valueOf(200));
	}
	
	@DeleteMapping("/internDelete/{internId}")
	@ResponseBody
	public ResponseEntity<internDto> internDeleteById(@PathVariable("internId") Integer internID , internDto dto)
	{
		service.internDeleteById(internID,dto);
		return new ResponseEntity<>(dto,HttpStatus.valueOf(dto.getStatus()));
	}
	
	@PutMapping("internUpdate/{internId}/{managerId}")
	@ResponseBody
	public ResponseEntity<internDto> internUpdateBymanageId(@PathVariable Integer internId, @PathVariable Integer managerId ,internDto dto) {
//		System.err.println(internId);
		service.internUpdateBymanageId(internId,managerId,dto);
		return new ResponseEntity<>(dto,HttpStatus.valueOf(dto.getStatus()));
	}
	
	@GetMapping("/internDataShow")
	@ResponseBody
	public List<Intern> internDataShow() {
		
		if(service.internDataShow().isEmpty())
		{
			return (List<Intern>) new ResponseEntity("No Data",HttpStatus.valueOf(200));
		}
		else
		{
			return service.internDataShow();
		}
		
	}
	
	

}
