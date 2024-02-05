package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;
import com.example.demo.service.studentInfo;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequestMapping("/home")
public class homeController {
	
	@Autowired
	private studentInfo info;
	
	@PostMapping("/save")
	@ResponseBody
	public void save(@RequestBody Student student)
	{
		info.save(student);
	}
	
	@GetMapping("/show")
	@ResponseBody
	public List<Student> show()
	{
		return info.show();
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void delete(@RequestParam("id") Integer Id)
	{
		info.delete(Id);
	}
	
	@PutMapping("/update")
	@ResponseBody
	public Student update(@RequestBody Student student)
	{
		return info.update(student);
	}
	
	
	
	
	
}
