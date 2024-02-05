package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class school {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="std")
	private int Std;
	
	@Column(name="student")
	private int student;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStd() {
		return Std;
	}

	public void setStd(int std) {
		Std = std;
	}

	public int getStudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "school [id=" + id + ", name=" + name + ", type=" + type + ", Std=" + Std + ", student=" + student + "]";
	}

	public school(int id, String name, String type, int std, int student) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		Std = std;
		this.student = student;
	}

	public school() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
