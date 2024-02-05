package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.EmpInfo;



@Controller
@RequestMapping("/test")
public class homeController {
	
	@Autowired
	EmpInfo empInfo;
	
	@GetMapping("/")
	public ModelAndView index()
	{
		ModelAndView m1 = new ModelAndView();
		m1.setViewName("index");
		m1.addObject("name", empInfo.getalldata());
//		System.out.println(empInfo.getalldata());
		return m1;
	}
}
