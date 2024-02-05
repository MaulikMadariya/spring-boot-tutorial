package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Country;

public interface CountryService {
	
	ResponseDto addCountry(Country country , ResponseDto dto);
	
	void editCountryByState(Integer countryId ,  Integer... stateId );
	
	List<Country> showCountry();
}
