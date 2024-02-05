package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.internDto;
import com.example.demo.model.Intern;

public interface internService {

	Intern save(Intern intern);
	
	internDto internDeleteById(Integer internId , internDto dto);
	
	internDto internUpdateBymanageId(Integer internId,Integer managerId ,internDto dto);
	
	List<Intern> internDataShow();
}
