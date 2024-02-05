package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.internDto;
import com.example.demo.model.Intern;
import com.example.demo.model.Manager;
import com.example.demo.repository.internRepo;
import com.example.demo.repository.managerRepo;

@Service
public class internServiceImpl implements internService {

	@Autowired
	private internRepo repo;
	
	@Autowired
	private managerRepo repo2;
	

	@Override
	public Intern save(Intern intern) {
		return repo.save(intern);

	}

	@Override
	public internDto internDeleteById(Integer internId, internDto dto) {

		Optional<Intern> s = repo.findById(internId);
		if (s.isEmpty()) {
			dto.setData("intern not Found....");
			dto.setMsg("Not Found");
			dto.setStatus(404);
			return dto;
		} else {
			
			repo.deleteById(internId);
			dto.setData("intern deleted....");
			dto.setMsg("Ok");
			dto.setStatus(200);
			return dto;
		}

//		repo.deleteById(internId);

	}

	@Override
	public internDto internUpdateBymanageId(Integer internId, Integer managerId,internDto dto) {

//		System.err.println(internId);
		Optional<Intern> s = repo.findById(internId);
//		System.err.println(s);
		
		if(s.isEmpty())
		{
			dto.setData("intern not Found....");
			dto.setMsg("Not Found");
			dto.setStatus(404);
			return dto;
		}
		else
		{
			Optional<Manager> s2  = repo2.findById(managerId);
//			System.err.println(s2);
			if(s2.isEmpty())
			{
				dto.setData("Manager Not Found....");
				dto.setMsg("Not Found");
				dto.setStatus(404);
				return dto;
			}
			else
			{
				Intern i = repo.findById(internId).get();
				Manager m2 = new Manager();
				m2.setManagerId(managerId);
				i.setManagerId(m2);
				repo.save(i);
				
				dto.setData("intern Updated....");
				dto.setMsg("Ohk");
				dto.setStatus(200);
				return dto;
			}
		}
		
	}

	@Override
	public List<Intern> internDataShow() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
