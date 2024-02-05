package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Car;

@Service
public class CarInfoImpl implements carInfo {
	List<Car> car = new ArrayList<>();

	@Override
	public void first() {

		car.clear();
		if (car.isEmpty()) {
			Car c = new Car();

			c.setName("zen");
			c.setCompany("Maruti Suzuki");
			c.setStock(100);
			car.add(c);
		}

		System.out.println(car.get(0));
	}

	@Override
	public void all() {
		car.clear();
		if (car.isEmpty()) {
			Car c = new Car();

			c.setName("zen");
			c.setCompany("Maruti Suzuki");
			c.setStock(100);

			Car c1 = new Car();

			c1.setName("city");
			c1.setCompany("Honda");
			c1.setStock(1000);

			Car c2 = new Car();

			c2.setName("kia");
			c2.setCompany("Hundai");
			c2.setStock(100);

			car.add(c);
			car.add(c1);
			car.add(c2);
		}

		System.out.println(car);
	}

}
