package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepo carRepo;
	
	@Override
	public void save(Car car) {
		// TODO Auto-generated method stub
		carRepo.save(car);
	}

	@Override
	public ResponseDto delete(Long carId, ResponseDto dto) {
		carRepo.deleteById(carId);
		dto.setStatus(200);
		dto.setMessage("succes");
		dto.setData("Car is Deleted....");
		return dto;
	}

	@Override
	public List<Car> find() {
		
		return carRepo.findAll();
	}

}
