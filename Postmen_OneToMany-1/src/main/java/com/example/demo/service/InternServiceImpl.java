package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Intern;
import com.example.demo.repository.InternRepo;

@Service
public class InternServiceImpl implements InternService{

	@Autowired
	private InternRepo internRepo;
	
	@Override
	public ResponseDto addIntern(Intern intern, ResponseDto dto) {
		internRepo.save(intern);
		dto.setStatus(200);
		dto.setMessage("Sucess");
		dto.setData("Intern Added.......");
		return dto;
	}

	@Override
	public ResponseDto dispSalary(Integer internSalary , ResponseDto dto) {
		// TODO Auto-generated method stub
		Object salaryIntern = internRepo.salaryIntern(internSalary);
		System.err.println(salaryIntern);
		dto.setStatus(200);
		dto.setMessage("sucess");
		dto.setData(salaryIntern);
		
		return dto;
	}

}
