package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="intern")
public class Intern
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="intern_id")
	private int internId;
	
	@Column(name="intern_name")
	private String internName;
	
	@Column(name="intern_dept")
	private String internDept;
	
	public Manager getManagerId() {
		return managerId;
	}

	public void setManagerId(Manager managerId) {
		this.managerId = managerId;
	}

	@OneToOne
	private Manager managerId;

	

	@Override
	public String toString() {
		return "Intern [internId=" + internId + ", internName=" + internName + ", internDept=" + internDept
				+ ", managerId=" + managerId + "]";
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

	public String getInternDept() {
		return internDept;
	}

	public void setInternDept(String internDept) {
		this.internDept = internDept;
	}

	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intern(int internId, String internName, String internDept, Manager managerId) {
		super();
		this.internId = internId;
		this.internName = internName;
		this.internDept = internDept;
		this.managerId = managerId;
	}

	
	
	
	
}
