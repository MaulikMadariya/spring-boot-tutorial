package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private int price;
	
	@Column(name="closeingPrice")
	private int closeingPrice;
	
	@Column(name = "openingPrice")
	private int openingPrice;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "predation")
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

	public String getpredation() {
		return predation;
	}

	public void setpredation(String predation) {
		this.predation = predation;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", price=" + price + ", closeingPrice=" + closeingPrice
				+ ", openingPrice=" + openingPrice + ", department=" + department + ", Predation=" + predation + "]";
	}
}
