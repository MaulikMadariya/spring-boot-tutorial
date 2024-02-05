package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class HomeController {

	@Autowired
	StudentService  service;
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<StudentDto> abc = service.find();
//		System.err.println(abc);
		modelAndView.addObject("data", abc);
		return modelAndView;
	}

	@GetMapping("/add")
	public ModelAndView add() {
		ModelAndView modelAndView = new ModelAndView("add");
		return modelAndView;
	}
	
	@PostMapping("/addStudent")
	public ModelAndView addStudent(@ModelAttribute("Student") StudentDto dto , BindingResult result )
	{
		service.save(dto);
		return new ModelAndView("redirect:/student/index");
	}
	
	@GetMapping("/delete/{studentId}")
	public ModelAndView delete(@PathVariable("studentId") Long studentId)
	{
		service.delete(studentId);
		return new ModelAndView("redirect:/student/index");
	}
	
	@GetMapping("/edit/{studentId}")
	public ModelAndView edit(@PathVariable("studentId") Long studentId)
	{
		ModelAndView modelAndView = new ModelAndView("edit");
		StudentDto studentDto = service.edit(studentId);
		modelAndView.addObject("data", studentDto);
		return modelAndView;
	}
}
