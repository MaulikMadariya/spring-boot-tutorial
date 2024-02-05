package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="car_id")
	private long carId;
	
	@Column(name="car_name")
	private String carName;
	
	@Column(name="car_price")
	private long carPrice;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(long carId, String carName, long carPrice) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carPrice=" + carPrice + "]";
	}

	public long getCarId() {
		return carId;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public long getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(long carPrice) {
		this.carPrice = carPrice;
	}
	
	
}
