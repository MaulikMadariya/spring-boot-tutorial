package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "state")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="state_id")
	private int stateId;

	@Column(name="state_name")
	private String satateName;

	@Column(name="state_population")
	private long statePopulation;

	@ManyToOne(targetEntity = Country.class)
	Country country;

	

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", satateName=" + satateName + ", statePopulation=" + statePopulation
				+ ", country=" + country + "]";
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getSatateName() {
		return satateName;
	}

	public void setSatateName(String satateName) {
		this.satateName = satateName;
	}

	public long getStatePopulation() {
		return statePopulation;
	}

	public void setStatePopulation(long statePopulation) {
		this.statePopulation = statePopulation;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
