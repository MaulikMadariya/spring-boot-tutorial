package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Emp;



@Service
public class EmpInfoImpl implements EmpInfo {
	
	public void set()
	{
		Emp e = new Emp();
		e.setEmpName("Maulik");
		e.setSalary(100000l);
		e.setDept("IT");
		
		Emp e1 = new Emp();
		e1.setEmpName("Madhvesh");
		e1.setSalary(80000l);
		e1.setDept("IT");
		
		Emp e2 = new Emp();
		e2.setEmpName("Mihir");
		e2.setSalary(200000l);
		e2.setDept("IT");
		
		arr.add(e);
		arr.add(e1);
		arr.add(e2);
	}


	List arr = new ArrayList<>();
	@Override
	public void all() {
		
		set();
		System.out.println(arr);
		
	}

	@Override
	public void first() {
		// TODO Auto-generated method stub
		set();
		System.out.println(arr.get(0));
		
	}

	
}
