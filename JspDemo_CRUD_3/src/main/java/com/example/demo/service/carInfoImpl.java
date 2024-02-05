package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.carDto;
import com.example.demo.model.Car;
import com.example.demo.repository.carRepo;

@Service
public class carInfoImpl implements carInfo{

	@Autowired
	carRepo repo;
	
	@Override
	public void save(carDto carDto) {
		
		
		Car c = new Car();
		c.setId(carDto.getId());
		c.setCompany(carDto.getCompany());
		c.setName(carDto.getName());
		c.setPrice(carDto.getPrice());
		c.setType(carDto.getType());
		System.err.println(c);
		repo.save(c);
		
	}

	@Override
	public List<carDto> show() {
		
		List<carDto> arr = new ArrayList<>();
		
		List<Car> s = repo.findAll();
		
		for(Car x : s)
		{
			carDto carDto = new carDto();
			carDto.setCompany(x.getCompany());
			carDto.setName(x.getName());
			carDto.setPrice(x.getPrice());
			carDto.setType(x.getType());
			carDto.setId(x.getId());
			arr.add(carDto);
		}
//		System.err.println(arr);
		return arr;
	}

	@Override
	public void delete(Integer Id) {
		repo.deleteById(Id);
		
	}

	@Override
	public Car edit(Integer Id) {
		return repo.findById(Id).get();
	}

}
