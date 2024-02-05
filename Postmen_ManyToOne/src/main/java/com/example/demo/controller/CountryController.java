package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Country;
import com.example.demo.service.CountryService;

@Controller
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@PostMapping("/addCountry")
	@ResponseBody
	public ResponseDto addCountry(@RequestBody Country country, ResponseDto dto) {
		countryService.addcountry(country, dto);
		return dto;
	}

	@GetMapping("/showCountry")
	@ResponseBody
	public List<Country> showCountry() {
		List<Country> countries = countryService.showCountry();
		return countries;
	}
}