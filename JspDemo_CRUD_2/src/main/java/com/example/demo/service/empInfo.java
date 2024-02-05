package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.empDto;
import com.example.demo.model.Emp;

public interface empInfo {

	List<empDto> show();
	
	void add(empDto emp);
	void delete(Integer id);
	
	Emp edit(Integer Id);
}
