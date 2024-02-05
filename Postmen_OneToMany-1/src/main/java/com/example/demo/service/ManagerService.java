package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Manager;

public interface ManagerService {
	
	public ResponseDto addManager(Manager manager , ResponseDto dto);
	
	public void editInternManagerById( Integer managerId , Integer... internId);
	
	public List<Manager> findAllManager();
}
