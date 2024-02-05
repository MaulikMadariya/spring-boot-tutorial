package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class HomeController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/signup")
	public ModelAndView signUp() {
		ModelAndView andView = new ModelAndView("signup");
		return andView;
	}

	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView andView = new ModelAndView("home");
		return andView;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView andView = new ModelAndView("Login");
		return andView;
	}

	@GetMapping("/user")
	public ModelAndView user() {
		Authentication name = SecurityContextHolder.getContext().getAuthentication();
		String username = name.getName();
		Collection<? extends GrantedAuthority> Role = name.getAuthorities();
		ModelAndView andView = new ModelAndView("user");
		andView.addObject("name", username);
		andView.addObject("role", Role);
		return andView;
	}

	@GetMapping("/admin")
	public ModelAndView admin() {
		Authentication name = SecurityContextHolder.getContext().getAuthentication();
		String username = name.getName();
		Collection<? extends GrantedAuthority> Role = name.getAuthorities();	
		ModelAndView andView = new ModelAndView("admin");
		andView.addObject("name", username);
		andView.addObject("role", Role);
		return andView;
	}

	@GetMapping("/about")
	public ModelAndView about() {
		ModelAndView andView = new ModelAndView("about");
		return andView;
	}
	
	

	@PostMapping("/addUser")
	public ModelAndView addUser(@ModelAttribute Student student) {
		ResponseEntity<ResponseDto>  entity = studentService.addStudent(student);
		ModelAndView andView;
		if(entity.getBody().getStatus() == 500)
		{
			 andView = new ModelAndView("redirect:/student/signup?error");
			 andView.addObject("body", entity.getBody().getMessage());
		}
		else {
			andView =  new ModelAndView("redirect:/student/signup?success");
			andView.addObject("body", entity.getBody().getMessage());
		}
		 
		 return andView;
	}

}
