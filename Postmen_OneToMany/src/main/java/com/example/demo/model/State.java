package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="state")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="state_id")
	private int stateId;
	
	@Column(name="state_name")
	private String stateName;
	
	@Column(name="state_population")
	private long statePopulation;

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(int stateId, String stateName, long statePopulation) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.statePopulation = statePopulation;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", statePopulation=" + statePopulation + "]";
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public long getStatePopulation() {
		return statePopulation;
	}

	public void setStatePopulation(long statePopulation) {
		this.statePopulation = statePopulation;
	}
	
	
}
