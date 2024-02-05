package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="leptop")
public class Leptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="leptop_id")
	private int leptopId;
	
	@Column(name="leptop_name")
	private String leptopName;
	
	@Column(name="leptop_price")
	private long leptopPrice;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;

	public int getLeptopId() {
		return leptopId;
	}

	public void setLeptopId(int leptopId) {
		this.leptopId = leptopId;
	}

	public String getLeptopName() {
		return leptopName;
	}

	public void setLeptopName(String leptopName) {
		this.leptopName = leptopName;
	}

	public long getLeptopPrice() {
		return leptopPrice;
	}

	public void setLeptopPrice(long leptopPrice) {
		this.leptopPrice = leptopPrice;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Leptop [leptopId=" + leptopId + ", leptopName=" + leptopName + ", leptopPrice=" + leptopPrice
				+ ", student=" + student + "]";
	}
	
	
}
