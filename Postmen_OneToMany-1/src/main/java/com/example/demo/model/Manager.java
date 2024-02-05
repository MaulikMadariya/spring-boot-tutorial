package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@Column(name="manager_salary")
	private long managerSalary;
	
	@OneToMany(targetEntity = Intern.class)
	List<Intern> interns;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int managerId, String managerName, long managerSalary, List<Intern> interns) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerSalary = managerSalary;
		this.interns = interns;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerSalary=" + managerSalary
				+ ", interns=" + interns + "]";
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

	public long getManagerSalary() {
		return managerSalary;
	}

	public void setManagerSalary(long managerSalary) {
		this.managerSalary = managerSalary;
	}

	public List<Intern> getInterns() {
		return interns;
	}

	public void setInterns(List<Intern> interns) {
		this.interns = interns;
	}
	
	
}
