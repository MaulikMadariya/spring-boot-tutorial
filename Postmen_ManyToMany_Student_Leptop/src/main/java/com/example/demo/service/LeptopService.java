package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Leptop;
import com.example.demo.model.Student;

public interface LeptopService {

	ResponseDto addLeptop(Leptop leptop , ResponseDto dto);
	
	List<Leptop> showLeptop();
	
	Student updateLeptop(Integer leptopId ,Integer studentId);
}
