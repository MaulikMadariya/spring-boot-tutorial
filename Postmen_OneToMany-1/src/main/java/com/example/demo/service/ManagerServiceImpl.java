package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Intern;
import com.example.demo.model.Manager;
import com.example.demo.repository.InternRepo;
import com.example.demo.repository.ManagerRepo;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepo managerRepo;
	
	@Autowired
	private InternRepo internRepo;
	
	@Override
	public ResponseDto addManager(Manager manager, ResponseDto dto) {
		managerRepo.save(manager);
		
		dto.setMessage("Sucess");
		dto.setStatus(200);
		dto.setData("Manager added......");
		return null;
	}

	@Override
	public void editInternManagerById(Integer managerId, Integer... internId) {
		Manager manager = managerRepo.findById(managerId).get();
		List<Intern> interns = new ArrayList<>();
		for(Integer x : internId)
		{
			interns.add(internRepo.findById(x).get());
		}
		manager.setInterns(interns);
		managerRepo.save(manager);
		
		
		
		
	}

	@Override
	public List<Manager> findAllManager() {
		
		return managerRepo.findAll();
	}

}
