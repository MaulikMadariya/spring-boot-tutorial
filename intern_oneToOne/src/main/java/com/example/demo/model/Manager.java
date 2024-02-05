package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="manager_id")
	private int managerId;
	
	@Column(name="manager_name")
	private String managerName;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int managerId, String managerName, String managerRole) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerRole = managerRole;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerRole=" + managerRole
				+ "]";
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

	public String getManagerRole() {
		return managerRole;
	}

	public void setManagerRole(String managerRole) {
		this.managerRole = managerRole;
	}

	@Column(name="manager_role")
	private String managerRole;
	
	

}
