package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.carNotFindById;
import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepo carRepo;
	
	@Override
	public Car findCarById(Long carId) {
	Car car = carRepo.findById(carId).orElseThrow(()-> new carNotFindById("Car Not Found By Id"));
	return car;
	}

}
