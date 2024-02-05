package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	
	
	@GetMapping("/")
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("name", "Index");
		return modelAndView;
	}

	@GetMapping("/admin/index")
	public ModelAndView admin() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("name", "admin");
		return modelAndView;
	}
	

	@GetMapping("/user/index")
	public ModelAndView user() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("name", "user");
		return modelAndView;
	}
}
