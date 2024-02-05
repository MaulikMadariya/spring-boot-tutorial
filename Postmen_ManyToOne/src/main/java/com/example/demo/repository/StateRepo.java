package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.State;

@Repository
public interface StateRepo extends JpaRepository<State, Integer>{

	@Query(value = "SELECT c.country_name FROM country as c INNER JOIN state as s ON c.country_id = s.country_country_id WHERE s.state_name = ?1" ,nativeQuery = true)
	public String findCountryByState(String stateName);
}
