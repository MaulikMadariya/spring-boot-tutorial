package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Leptop;
import com.example.demo.model.Student;
import com.example.demo.repository.LeptopRepo;
import com.example.demo.repository.StudentRepo;

@Service
public class LeptopServiceImpl implements LeptopService {

	@Autowired
	private LeptopRepo leptopRepo;
	
	@Autowired StudentRepo studentRepo;
	
	@Override
	public ResponseDto addLeptop(Leptop leptop, ResponseDto dto) {
		if(leptop != null)
		{
			leptopRepo.save(leptop);
			dto.setStatus(200);
			dto.setMessage("Sucess");
			dto.setData("Leptop Added.....");
		}
		else
		{
			dto.setStatus(500);
			dto.setMessage("Error");
			dto.setData("Leptop Not Added.....");
		}
		return dto;
	}

	@Override
	public List<Leptop> showLeptop() {
		return leptopRepo.findAll();
	}

	@Override
	public Student updateLeptop(Integer leptopId, Integer studentId) {
//		System.err.println(leptopId);
//		System.err.println(studentId);
		List<Leptop> leptops = null;
		Leptop leptop = leptopRepo.findById(leptopId).get();
		Student student = studentRepo.findById(studentId).get();
		leptops = student.getLeptops();
		leptops.add(leptop);
//		System.err.println(leptops);
		student.setLeptops(leptops);
		return studentRepo.save(student);
	}

}
