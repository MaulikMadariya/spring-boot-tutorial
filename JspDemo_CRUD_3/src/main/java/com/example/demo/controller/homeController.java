package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.carDto;
import com.example.demo.model.Car;
import com.example.demo.service.carInfo;

@Controller
public class homeController {

	@Autowired
	carInfo info;
	
	@GetMapping("/index")
	public ModelAndView show()
	{
		ModelAndView show = new ModelAndView("show");
		show.addObject("name", info.show());
		return show;
	}
	
	@GetMapping("/add")
	public ModelAndView add()
	{
		ModelAndView add = new ModelAndView("add");
		return add;
	}
	
	@PostMapping("/addCar")
	public ModelAndView addCar(@ModelAttribute("car") carDto carDto , BindingResult result)
	{
		info.save(carDto);
//		System.err.println(carDto);
		return new ModelAndView("redirect:/index");
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("id") Integer Id)
	{
		info.delete(Id);
		return new ModelAndView("redirect:/index");
	}
	
	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam("id") Integer Id)
	{
		ModelAndView modelAndView = new ModelAndView("edit");
		modelAndView.addObject("name", info.edit(Id));
		return modelAndView;
	}
}
