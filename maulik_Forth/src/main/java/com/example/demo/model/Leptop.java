package com.example.demo.model;

public class Leptop {
	private String LeptopName;
	private String Brand;
	private int Price;
	public String getLeptopName() {
		return LeptopName;
	}
	public void setLeptopName(String leptopName) {
		LeptopName = leptopName;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Leptop [LeptopName=" + LeptopName + ", Brand=" + Brand + ", Price=" + Price + "]";
	}
	
	
	
}
