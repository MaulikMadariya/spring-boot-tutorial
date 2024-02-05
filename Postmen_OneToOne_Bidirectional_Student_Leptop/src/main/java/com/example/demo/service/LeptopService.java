package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Leptop;

public interface LeptopService {

	ResponseDto addLeptop(Leptop leptop , ResponseDto dto);
	
	List<Leptop> showleptop();
	
	Leptop updateStudentByleptop(Integer laptopId ,Integer studentId);
}
