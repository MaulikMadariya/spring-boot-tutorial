package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public ResponseDto addStudent(@RequestBody Student student, ResponseDto dto) {
		studentService.addStudent(student, dto);
		return dto;
	}
	
	@GetMapping("/showStudent")
	public List<Student> showStudent()
	{
		List<Student> std = studentService.showStudent();
		return std;
	}
}
