package com.example.demo.service;

import java.util.List;

import com.example.demo.model.school;

public interface schoolInfo {

	void save(school school);
	
	List<school> show();
	
	void delete(Integer Id);
	
	school update(school school);
}
