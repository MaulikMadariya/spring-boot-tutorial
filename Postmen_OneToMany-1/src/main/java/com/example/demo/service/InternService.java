package com.example.demo.service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Intern;

public interface InternService {
	
	ResponseDto addIntern(Intern intern , ResponseDto dto);
	
	ResponseDto dispSalary(Integer internSalary , ResponseDto dto);
}
