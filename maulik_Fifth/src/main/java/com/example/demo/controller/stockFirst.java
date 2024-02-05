package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.stockInfo;

@Controller
@ResponseBody
@RequestMapping("/first")
public class stockFirst {
	
	@Autowired
	stockInfo info;
	
	@GetMapping("/")
	public String first()
	{
		info.first();
		return "This is Show <b>First</b> Stock in Consol";
	}
}
