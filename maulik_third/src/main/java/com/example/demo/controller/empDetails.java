package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.EmpInfo;

@Controller
@ResponseBody
@RequestMapping("/Emp")
public class empDetails
{
	@Autowired
	EmpInfo empInfo;
	@GetMapping("/first")
	public String first()
	{
		empInfo.first();
		return "This is Show <b>First</b> Employee Data in Consol";
	}
	@GetMapping("/all")
	public String all()
	{
		empInfo.all();
		return "This is Show <b>all</b> Employee Data in Consol";
	}
}
