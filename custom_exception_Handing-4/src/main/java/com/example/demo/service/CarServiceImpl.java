package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.carNotFoundById;
import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepo repo;
	
	@Override
	public Car carFindById(Long carId) {
		Car car =repo.findById(carId).orElseThrow(()->new carNotFoundById("Car Not FOund......."));
		return car;
	}

	

}
