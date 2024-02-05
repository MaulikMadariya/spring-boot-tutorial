package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Country;
import com.example.demo.service.CountryService;
import com.example.demo.service.StateService;

@Controller
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateservice;
	
	@PostMapping("/addCountry")
	@ResponseBody
	public ResponseDto addCountry(@RequestBody Country country , ResponseDto dto)
	{
		countryService.addCountry(country, dto);
		return dto;
	}
	
	@PutMapping("/updateCountry")
	@ResponseBody
	public void editCountryByState(@RequestParam("countryId") Integer countryId  ,@RequestParam("stateId") Integer... stateId  )
	{
		countryService.editCountryByState(countryId , stateId);
		
	}
	
	@GetMapping("/showCountry")
	@ResponseBody
	public List<Country> showCountry(){
		List<Country> showCountry = countryService.showCountry();
		return showCountry;
	}
}









