package com.example.demo.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

import net.sf.jasperreports.engine.JRException;

@RestController
public class HomeController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/report/{format}")
	public String report(@PathVariable String format) throws FileNotFoundException, JRException
	{
		
		return service.exportReport(format);
	}
}
