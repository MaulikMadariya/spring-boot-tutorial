package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/Employee")
public class HomeController {

	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/employeeFindById/{employeeId}")
	public ResponseEntity<Employee> employeeFindById(@PathVariable("employeeId") Long employeeId)
	{
		Employee employeeFind = employeeService.employeeFind(employeeId);
		return new ResponseEntity<Employee>(employeeFind,HttpStatus.valueOf(200));
	}
}
