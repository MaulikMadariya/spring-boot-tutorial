package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Country;

public interface CountryService {
	
	ResponseDto addcountry(Country country , ResponseDto dto);
	
	List<Country> showCountry();
}
