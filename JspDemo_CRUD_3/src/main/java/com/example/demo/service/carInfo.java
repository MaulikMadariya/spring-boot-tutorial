package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.carDto;
import com.example.demo.model.Car;

public interface carInfo {

	List<carDto> show();
	
	void save(carDto carDto);
	
	Car edit(Integer Id);
	
	void delete(Integer Id);
}
