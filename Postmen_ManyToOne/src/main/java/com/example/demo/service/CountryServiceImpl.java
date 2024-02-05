package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepo;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepo countryRepo;

	@Override
	public ResponseDto addcountry(Country country, ResponseDto dto) {
		countryRepo.save(country);
		if (country != null) {
			dto.setData("State Added.....");
			dto.setStatus(200);
			dto.setMessage("Sucess");
		} else {
			dto.setData("State Not Added.....");
			dto.setStatus(500);
			dto.setMessage("Error");
		}
		return null;

	}

	@Override
	public List<Country> showCountry() {
		return countryRepo.findAll();
	}

}
