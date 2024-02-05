package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.stockDto;
import com.example.demo.model.Stock;
import com.example.demo.service.stockInfo;

@Controller
public class homeController {

	@Autowired
	stockInfo info;

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home");
		view.addObject("name", info.all());
		return view;
	}

	@GetMapping("/add")
	public ModelAndView add() {
		ModelAndView add = new ModelAndView("add");
		return add;
	}

	@PostMapping("/addStock")
	public ModelAndView addStock(@ModelAttribute("Stock") stockDto stockdto, BindingResult result) {
		info.save(stockdto);
		return new ModelAndView("redirect:/");
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("id") Integer id) {
		info.delete(id);
		return new ModelAndView("redirect:/");
	}

	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam("id") Integer id)
	{
		ModelAndView edit = new ModelAndView("edit");
		edit.addObject("name", info.edit(id));
		return edit;
	}
	
	
	@GetMapping("/index")
	public ModelAndView index()
	{
		ModelAndView index = new ModelAndView("index");		
		return index;
	}
	@GetMapping("/login")
	public ModelAndView login()
	{
		ModelAndView login = new ModelAndView("login");		
		return login;
	}
	
	@GetMapping("/signup")
	public ModelAndView signup()
	{
		ModelAndView signup = new ModelAndView("signup");		
		return signup;
	}
	

}
