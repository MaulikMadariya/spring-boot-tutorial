package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="manager")
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="manager_id")
	private int managerId;
	
	@Column(name="manager_name")
	private String managerName;
	
	@Column(name="salary")
	private int salary;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int managerId, String managerName, int salary) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", salary=" + salary + "]";
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
