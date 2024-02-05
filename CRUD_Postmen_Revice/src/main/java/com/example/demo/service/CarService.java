package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Car;

public interface CarService {
	public void save(Car car);
	
	public ResponseDto delete(Long carId , ResponseDto dto);
	
	public List<Car> find();
}
