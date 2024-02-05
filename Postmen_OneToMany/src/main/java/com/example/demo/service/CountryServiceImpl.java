package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Country;
import com.example.demo.model.State;
import com.example.demo.repository.CountryRepo;
import com.example.demo.repository.StateRepo;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepo countryRepo;

	@Autowired
	private StateRepo stateRepo;
	
	@Override
	public ResponseDto addCountry(Country country, ResponseDto dto) {

		countryRepo.save(country);
		dto.setStatus(200);
		dto.setMessage("sucess");
		dto.setData("Country Added.......");
		return dto;
	}

	@Override
	public void editCountryByState(Integer countryId ,Integer... stateId) {
		
		Country country = countryRepo.findById(countryId).get();
		List<State> states = new ArrayList<>();
		
		for(Integer x : stateId)
		{
			states.add(stateRepo.findById(x).get());
		}
		country.setStates(states);
		countryRepo.save(country);

		
	
	}

	@Override
	public List<Country> showCountry() {
		
		return countryRepo.findAll();
	}

	

}
