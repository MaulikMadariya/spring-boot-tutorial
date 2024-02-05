package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	

	@Value("${name}")
	private String name;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
//		System.err.println(name);
		modelAndView.addObject("user",name);
		return modelAndView;
	}

//	@GetMapping("/")
//	public ModelAndView index()
//	{
//		return new ModelAndView("index");
//	}

	@GetMapping("/user/index")
	public ModelAndView user() {
		ModelAndView modelAndView = new ModelAndView("index");
//		System.err.println(name);
		modelAndView.addObject("user", "user");
		return modelAndView;
	}

	@GetMapping("/admin/index")
	public ModelAndView admin() {
		ModelAndView modelAndView = new ModelAndView("index");
//		System.err.println(name);
		modelAndView.addObject("user", "admin");
		return modelAndView;
	}
}
