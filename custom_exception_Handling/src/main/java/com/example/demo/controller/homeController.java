package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class homeController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/findStudent/{studentId}")
	ResponseEntity<Student> findStudentData(@PathVariable("studentId") Integer studentId   )
	{
		Student s = service.findAllStudent(studentId);
		return new ResponseEntity<Student>(s,HttpStatusCode.valueOf(200));
	}
}
