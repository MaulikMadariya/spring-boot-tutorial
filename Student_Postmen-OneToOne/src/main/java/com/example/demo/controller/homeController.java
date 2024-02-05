package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/home")
public class homeController {

	@Autowired
	StudentService service;
	
	@PostMapping("/studentSave")
	@ResponseBody
	public void add(@RequestBody Student student)
	{
		service.save(student);
	}
	
	@PutMapping("/updateStudent")
	@ResponseBody
	public void update(@RequestParam("studentId") Integer studentId , @RequestParam("bookId") Integer bookId)
	{
		service.updateStudentWithBookID(studentId , bookId);
	}
	
	@GetMapping("/show")
	@ResponseBody
	public List<Student> show()
	{
		return service.show();
	}
	
	
}
