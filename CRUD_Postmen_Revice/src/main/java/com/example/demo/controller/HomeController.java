package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@Controller
@RequestMapping("/car")
public class HomeController {

	@Autowired
	private CarService carService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Car car)
	{
		carService.save(car);
		return new ResponseEntity<String>("Hello",HttpStatusCode.valueOf(200));
	}
	
	@DeleteMapping("/delete/{carId}")
	public ResponseEntity<ResponseDto> delete(@PathVariable("carId") Long carId , ResponseDto dto)
	{
		carService.delete(carId, dto);
		return new ResponseEntity<ResponseDto>(dto,HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/show")
	@ResponseBody
	public List<Car> show()
	{
		return carService.find();
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Car car)
	{
		carService.save(car);
		return new ResponseEntity<String>("Hello",HttpStatusCode.valueOf(200));
	}
}
