package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.leptopInfo;

@Controller
@ResponseBody
@RequestMapping("/Leptop")
public class LeptopDetails 
{
	@Autowired
	leptopInfo info;
	
	@GetMapping("/first")
	public String first()
	{
		info.first();
		return "This is Show <b>First</b> Leptop Data in Consol";
	}
	
	@GetMapping("/all")
	public String all()
	{
		info.all();
		return "This is Show <b>all</b> Leptop Data in Consol";
	}
}
