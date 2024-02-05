package com.example.demo.model;

public class Car {

	private String name;
	private String Company;
	private int stock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", Company=" + Company + ", stock=" + stock + "]";
	}
	
	
	
}
