package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="car_id")
	private Long carId;
	
	@Column(name="car_name")
	private String carName;
	
	@Column(name="company")
	private String company;
	
	@Column(name="car_price")
	private Long carPrice;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Long carId, String carName, String company, Long carPrice) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.company = company;
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", company=" + company + ", carPrice=" + carPrice + "]";
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Long getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(Long carPrice) {
		this.carPrice = carPrice;
	}
	
	
}