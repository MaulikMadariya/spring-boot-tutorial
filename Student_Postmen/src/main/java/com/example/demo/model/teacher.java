package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="teacher")
public class teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="school")
	private String School;
	
	@Column(name="exp")
	private int exp;
	
	@Column(name="dept")
	private String dept;
	
	@OneToOne
	private Book2 bookId;

	public Book2 getBookId() {
		return bookId;
	}

	public void setBookId(Book2 bookId) {
		this.bookId = bookId;
	}

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

	public String getSchool() {
		return School;
	}

	public void setSchool(String school) {
		School = school;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "teacher [id=" + id + ", name=" + name + ", School=" + School + ", exp=" + exp + ", dept=" + dept
				+ ", bookId=" + bookId + "]";
	}

	public teacher(int id, String name, String school, int exp, String dept, Book2 bookId) {
		super();
		this.id = id;
		this.name = name;
		School = school;
		this.exp = exp;
		this.dept = dept;
		this.bookId = bookId;
	}

	public teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
