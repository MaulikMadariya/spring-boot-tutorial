package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.empDto;
import com.example.demo.model.Emp;
import com.example.demo.repository.empRepo;

@Service
public class empInfoImpl implements empInfo {

	@Autowired
	empRepo repo;
	
	@Override
	public List<empDto> show() {
		
		List<empDto> arr = new ArrayList<>();
		
		List<Emp> s = repo.findAll();
		
		for(Emp x : s)
		{
			empDto dto = new empDto();
			dto.setId(x.getId());
			dto.setName(x.getName());
			dto.setSalary(x.getSalary());
			dto.setDept(x.getDept());
			dto.setRole(x.getRole());
			arr.add(dto);
		}
		return arr;
		
	}

	@Override
	public void add(empDto emp)
	{
		Emp em = new Emp();
		em.setId(emp.getId());
		em.setName(emp.getName());
		em.setSalary(emp.getSalary());
		em.setRole(emp.getRole());
		em.setDept(emp.getDept());
		
		repo.save(em);
		
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public Emp edit(Integer Id) {
		
		return repo.findById(Id).get();
	}

}
