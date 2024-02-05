package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController { 
	@GetMapping("/index")
//	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ModelAndView index ()
	{
		ModelAndView andView = new ModelAndView("index");
		return andView;
	}
	
	@GetMapping("/home")
//	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ModelAndView home()
	{
		ModelAndView andView = new ModelAndView("home");
		return andView;
	}
}
