package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.empDto;
import com.example.demo.model.Emp;
import com.example.demo.service.empInfo;

@Controller

public class homeController {

	@Autowired
	empInfo info;
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView index = new ModelAndView("index");
		index.addObject("name", info.show());
		return index;
	}

	@GetMapping("/add")
	public ModelAndView add() {
		ModelAndView add = new ModelAndView("add");
		return add;
	}
	
	@PostMapping("/addemp")
	public ModelAndView addEmp(@ModelAttribute("emp") empDto emp , BindingResult result)
	{
		info.add(emp);
		return new ModelAndView("redirect:/index");
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("id") Integer Id) {
		info.delete(Id);
		return new ModelAndView("redirect:/index");
	}
	
	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam("id") Integer Id)
	{
		
		info.edit(Id);
		ModelAndView edit = new ModelAndView("edit");
		edit.addObject("abc", info.edit(Id));
		return edit;
	}
	

	
}
