package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpRepo;

@Service
public class EmpInfoImpl implements EmpInfo{

	@Autowired
	
	EmpRepo empRepo;

	@Override
	public List<Employee> getalldata() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
	
	

}
