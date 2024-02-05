package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.carInfo;

@Controller
@ResponseBody
@RequestMapping("/Car")
public class carDetails {
	
	@Autowired
	carInfo carInfo;
	@GetMapping("/first")
	public String first()
	{
		carInfo.first();
		return "This is Show <b>First</b> Car Data in Consol";
	}
	
	@GetMapping("/all")
	public String all()
	{
		
		carInfo.all();
		return "This is Show <b>all</b> Student Data in Consol";
	}
}
