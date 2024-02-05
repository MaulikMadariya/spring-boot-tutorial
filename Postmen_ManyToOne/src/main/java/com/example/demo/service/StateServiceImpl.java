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

import jakarta.persistence.criteria.CriteriaBuilder.In;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepo stateRepo; 
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Override
	public ResponseDto addState(State state, ResponseDto dto) {
		stateRepo.save(state);
		if(state != null)
		{
			dto.setData("State Added.....");
			dto.setStatus(200);
			dto.setMessage("Sucess");
		}
		else
		{
			dto.setData("State Not Added.....");
			dto.setStatus(500);
			dto.setMessage("Error");
		}
		return null;
	}

	@Override
	public List<State> showState() {
		System.err.println(stateRepo.findCountryByState("Goa"));
		return stateRepo.findAll();
	}

	@Override
	public void updateState(Integer countryId, Integer... stateId) {
		
		Country country = countryRepo.findById(countryId).get();
		
		List<State> state = new ArrayList<>();
		
		for(Integer x : stateId)
		{
			State state2 = stateRepo.findById(x).get();
			state2.setCountry(country);
			stateRepo.save(state2);
		}
		
		
		
		
		
//		for(Integer x : stateId)
//		{
//			State state = stateRepo.findById(x).get();
//			state.setCountry(country);
//			stateRepo.save(state);
//		}
		
	}

}
