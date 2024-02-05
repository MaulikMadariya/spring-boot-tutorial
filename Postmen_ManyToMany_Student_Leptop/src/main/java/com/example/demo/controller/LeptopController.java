package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Leptop;
import com.example.demo.model.Student;
import com.example.demo.service.LeptopService;

@RestController
@RequestMapping("/leptop")
public class LeptopController {

	@Autowired
	private LeptopService leptopService;
	
	@PostMapping("/addLeptop")
	public ResponseDto addLeptop(@RequestBody Leptop leptop , ResponseDto dto)
	{
		leptopService.addLeptop(leptop,dto);
		return dto;
	}
	
	@GetMapping("/showLeptop")
	public List<Leptop> showLeptop()
	{
	 	List<Leptop> ltp = leptopService.showLeptop();
	 	return ltp;
	}
	
	@PutMapping("/updateLeptop")
	public Student updateLeptop(@RequestParam("leptopId") Integer leptopId , @RequestParam("studentId") Integer studentId)
	{
		return leptopService.updateLeptop(leptopId , studentId); 
	}
}
