package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Stock;
import com.example.demo.repository.stockRepo;

@Service
public class stockInfoImpl implements stockInfo{

	@Autowired
	
	stockRepo repo;
	
	public List<Stock> all() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
