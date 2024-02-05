package com.example.demo.service;

import java.util.List;

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
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public ResponseDto addLeptop(Leptop leptop, ResponseDto dto) {
		leptopRepo.save(leptop);
		dto.setStatus(200);
		dto.setMessage("Sucess");
		dto.setData("leptop Added");
		return dto;
	}

	@Override
	public List<Leptop> showleptop() {
		return leptopRepo.findAll();
	}

	@Override
	public Leptop updateStudentByleptop(Integer laptopId, Integer studentId) {
		Leptop leptop = leptopRepo.findById(laptopId).get();
		Student student = studentRepo.findById(studentId).get();
		leptop.setStudent(student);
		return leptopRepo.save(leptop);
	}

}
