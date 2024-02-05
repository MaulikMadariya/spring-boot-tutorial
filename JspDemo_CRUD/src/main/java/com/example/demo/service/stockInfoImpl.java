package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.stockDto;
import com.example.demo.model.Stock;
import com.example.demo.repository.stockrepo;

@Service
public class stockInfoImpl implements stockInfo {

	
	@Autowired
	stockrepo repo;

	@Override
	public List<stockDto> all() {
		List<stockDto> arr = new ArrayList<>();
		
		List<Stock> sto = repo.findAll();
		System.err.println(sto);
		for(Stock s : sto)
		{
			stockDto dto = new stockDto();
			
			dto.setId(s.getId());
			dto.setName(s.getName());
			dto.setOpeningPrice(s.getOpeningPrice());
			dto.setCloseingPrice(s.getCloseingPrice());
			dto.setPrice(s.getPrice());
			dto.setDepartment(s.getDepartment());
			dto.setPredation(s.getpredation());
			arr.add(dto);
		}
		return arr;
	}

	@Override
	public void save(stockDto stockdto) {
		Stock s = new Stock();
		s.setId(stockdto.getId());
		s.setName(stockdto.getName());
		s.setCloseingPrice(stockdto.getCloseingPrice());
		s.setDepartment(stockdto.getDepartment());
		s.setOpeningPrice(stockdto.getOpeningPrice());
		s.setpredation(stockdto.getPredation());
		s.setPrice(stockdto.getPrice());
		repo.save(s);

	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public Map<String, Object> edit(Integer id) {
		
		Stock s = repo.findById(id).get();
//		System.out.println(s.getName());
		Map<String, Object> students = new HashMap<String, Object>();
		students.put("id", s.getId());
		students.put("name", s.getName());
		students.put("department", s.getDepartment());
		students.put("predation", s.getpredation());
		students.put("OpeningPrice", s.getOpeningPrice());
		students.put("CloseingPrice", s.getCloseingPrice());
		students.put("Price", s.getPrice());

//		System.err.println(students);

		return students;
	}

//	@Override
//	public Stock get(Integer id) {
//		// TODO Auto-generated method stub
//		return repo.findById(id).get();
//	}

}
