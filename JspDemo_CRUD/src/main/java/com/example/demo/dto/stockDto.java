package com.example.demo.dto;

public class stockDto {

	private int id;
	private String name;
	private int price;
	private int closeingPrice;
	private int openingPrice;
	private String department;
	private String predation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCloseingPrice() {
		return closeingPrice;
	}
	public void setCloseingPrice(int closeingPrice) {
		this.closeingPrice = closeingPrice;
	}
	public int getOpeningPrice() {
		return openingPrice;
	}
	public void setOpeningPrice(int openingPrice) {
		this.openingPrice = openingPrice;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPredation() {
		return predation;
	}
	public void setPredation(String predation) {
		this.predation = predation;
	}
	@Override
	public String toString() {
		return "stockDto [id=" + id + ", name=" + name + ", price=" + price + ", closeingPrice=" + closeingPrice
				+ ", openingPrice=" + openingPrice + ", department=" + department + ", predation=" + predation + "]";
	}
	
	
}
