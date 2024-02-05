package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="country")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="country_id")
	private int countryId;

	@Column(name="country_name")
	private String countryName;

	@Column(name="country_population")
	private long countryPopulation;

	

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", countryPopulation="
				+ countryPopulation + "]";
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(long countryPopulation) {
		this.countryPopulation = countryPopulation;
	}
	
	
	
	
}
