package com.example.demo.model;

public class User {

	private int Id;
	private String name;
	private int std;
	private int marks;
	

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", std=" + std + ", marks=" + marks + "]";
	}
	
	
	
}
