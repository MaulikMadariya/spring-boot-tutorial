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
import com.example.demo.model.school;
import com.example.demo.service.schoolInfo;

@Controller
@RequestMapping("/school")
public class schoolController {

	@Autowired
	schoolInfo info;
	
	@PostMapping("/save")
	@ResponseBody
	public void save(@RequestBody school school)
	{
		info.save(school);
	}
	
	@GetMapping("/show")
	@ResponseBody
	public List<school> show()
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
	public school update(@RequestBody school school)
	{
		return info.update(school);
	}
}
