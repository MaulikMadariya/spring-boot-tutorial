package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Intern;
import com.example.demo.model.Manager;
import com.example.demo.repository.InternRepo;

@Service
public class InternServiceImpl implements InternService {

	@Autowired
	private InternRepo repo;
	
	@Override
	public ResponseDto save(Integer internId, Integer managerId ,ResponseDto dto) {
		Intern intern = repo.findById(internId).get();
		
		Manager manager = new Manager();
		manager.setManagerId(managerId);
		
		intern.setManager(manager);
		repo.save(intern);
		
		
		dto.setMessage("success");
		dto.setStatus(200);
		dto.setData(repo.findById(internId));
		return dto;
		
	}
	
}
