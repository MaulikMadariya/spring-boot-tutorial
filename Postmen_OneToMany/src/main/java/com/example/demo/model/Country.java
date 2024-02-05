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
	
	@OneToMany(targetEntity = State.class)
	private List<State> states;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int countryId, String countryName, long countryPopulation, List<State> states) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryPopulation = countryPopulation;
		this.states = states;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", countryPopulation="
				+ countryPopulation + ", states=" + states + "]";
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

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	
	
	
}
