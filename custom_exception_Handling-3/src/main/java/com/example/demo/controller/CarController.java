package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@RestController
@RequestMapping("/Car")
public class CarController {

	@Autowired
	private CarService carService;
	
	@GetMapping("/showCarById")
	public Car showCarById(@RequestParam("carId") Long carId)
	{
		Car carById = carService.findCarById(carId);
		return carById;
	}
}
