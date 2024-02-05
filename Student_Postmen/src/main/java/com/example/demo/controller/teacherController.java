package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;
import com.example.demo.model.teacher;
import com.example.demo.service.teacherInfo;

@Controller
@RequestMapping("/teacher")
public class teacherController {

	@Autowired
	private teacherInfo info;
	
	@PostMapping("/save")
	@ResponseBody
	public void save(@RequestBody teacher teacher)
	{
		info.save(teacher);
	}
	
	@GetMapping("/show")
	@ResponseBody
	public List<teacher> show()
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
	public teacher update(@RequestBody teacher teacher)
	{
		return info.update(teacher);
	}
	
	@PutMapping("/oneToOne")
	@ResponseBody
	public void oneToOne(@RequestParam("teacherId") Integer teacherId , @RequestParam("bookId") Integer bookId)
	{
		info.onToOne(teacherId , bookId);
	}
	
}
