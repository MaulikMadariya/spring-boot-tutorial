package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployeeNotFoundById;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee employeeFind(Long employeeId) {
		
		Employee employee = employeeRepo.findById(employeeId).orElseThrow(()-> new EmployeeNotFoundById("Employee Not Found By Id..."));
		return employee;
	}

	

}
