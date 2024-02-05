package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
	
	@Column(name="salary")
	private int Salary;

	@OneToOne
	private Manager manager;

	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intern(int internId, String internName, int salary, Manager manager) {
		super();
		this.internId = internId;
		this.internName = internName;
		Salary = salary;
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Intern [internId=" + internId + ", internName=" + internName + ", Salary=" + Salary + ", manager="
				+ manager + "]";
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

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	
	
	
}
