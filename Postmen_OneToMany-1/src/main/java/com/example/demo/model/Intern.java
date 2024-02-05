package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="intern")
public class Intern {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="intern_id")
	private int internId;
	
	@Column(name="intern_name")
	private String internName;
	
	@Column(name="intern_salary")
	private long internSalary;

	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intern(int internId, String internName, long internSalary) {
		super();
		this.internId = internId;
		this.internName = internName;
		this.internSalary = internSalary;
	}

	@Override
	public String toString() {
		return "Intern [internId=" + internId + ", internName=" + internName + ", internSalary=" + internSalary + "]";
	}

	public int getInternId() {
		return internId;
	}

	public void setInternId(int internId) {
		this.internId = internId;
	}

	public String getInternName() {
		return internName;
	}

	public void setInternName(String internName) {
		this.internName = internName;
	}

	public long getInternSalary() {
		return internSalary;
	}

	public void setInternSalary(long internSalary) {
		this.internSalary = internSalary;
	}
	
	
	
}
