package com.example.demo.model;

public class Stock {

	private String Name;
	private int price;
	private String secter;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSecter() {
		return secter;
	}
	public void setSecter(String secter) {
		this.secter = secter;
	}
	@Override
	public String toString() {
		return "Stock [Name=" + Name + ", price=" + price + ", secter=" + secter + "]";
	}
	
	
	
}
