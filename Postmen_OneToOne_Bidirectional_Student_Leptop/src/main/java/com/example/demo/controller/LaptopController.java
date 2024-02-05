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
import com.example.demo.service.LeptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

	@Autowired
	private LeptopService leptopService;
	
	@PostMapping("/addLaptop")
	public ResponseDto addLaptop(@RequestBody Leptop leptop , ResponseDto dto)
	{
		leptopService.addLeptop(leptop,dto);
		return dto;
	}
	
	@GetMapping("/showLaptop")
	public List<Leptop> showLeptop()
	{
		return leptopService.showleptop();
	}
	
	@PutMapping("/updateStudentByleptop")
	public Leptop updateStudentByleptop(@RequestParam("laptopId") Integer laptopId , @RequestParam("studentId") Integer studentId )
	{
		return leptopService.updateStudentByleptop(laptopId,studentId);
	}
}














