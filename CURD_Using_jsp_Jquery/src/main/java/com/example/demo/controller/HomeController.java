package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class HomeController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@GetMapping("/showStudent")
	public ModelAndView showStudent() {
		ModelAndView modelAndView = new ModelAndView("showStudent");
		modelAndView.addObject("name", "Mb");
		return modelAndView;
	}
	
	@GetMapping("/about")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView("about");
		return modelAndView;
	}
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
	@GetMapping("/getStudent")
	public List<Student> getStudent(){
		List<Student> stu = studentService.getStudent();
//		System.err.println(stu);
		return stu;
	}
}
