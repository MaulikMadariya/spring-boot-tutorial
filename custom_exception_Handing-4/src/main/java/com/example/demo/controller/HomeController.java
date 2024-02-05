package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@Controller
@RequestMapping("/car")
public class HomeController {

	@Autowired
	private CarService service;
	
	@GetMapping("/find/{carId}")
	@ResponseBody
	public Car carFind(@PathVariable("carId") Long carId)
	{
		return service.carFindById(carId);
	}
}
