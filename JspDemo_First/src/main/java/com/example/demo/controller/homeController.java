package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	
	@GetMapping("/")
	public ModelAndView index()
	{
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("name", "MB");
		return modelAndView;
	}
	
}
