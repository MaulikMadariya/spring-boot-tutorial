package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
	private int leptopPrice;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "leptops")
	private List<Student> students = new ArrayList<>();

	@Override
	public String toString() {
		return "Leptop [leptopId=" + leptopId + ", leptopName=" + leptopName + ", leptopPrice=" + leptopPrice
				+ ", students=" + students + "]";
	}

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

	public int getLeptopPrice() {
		return leptopPrice;
	}

	public void setLeptopPrice(int leptopPrice) {
		this.leptopPrice = leptopPrice;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
