package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.StudentData;

@Controller
@RequestMapping("/User")
@ResponseBody
public class UserData {
	
	@Autowired
	StudentData data;
	
	@GetMapping("/all")
	public String home()
	{
		data.display();
		return "This is Show <b>all</b> Student Data in Consol";
	}
	
	@GetMapping("/first")
	public String first()
	{
		data.First();
		return "This is Show <b>First</b> Student Data in Consol";
	}
}
