package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Stock;

@Service
public class stockInfoImpl implements stockInfo {

	List<Stock> arr = new ArrayList<>();

	public void set() {
		arr.clear();
		if (arr.isEmpty()) {
			Stock s = new Stock();
			s.setName("Sbi");
			s.setPrice(500);
			s.setSecter("Bank");

			Stock s1 = new Stock();
			s1.setName("TataSteel");
			s1.setPrice(1000);
			s1.setSecter("Steel");

			Stock s2 = new Stock();
			s2.setName("infosys");
			s2.setPrice(5000);
			s2.setSecter("IT");

			arr.add(s);
			arr.add(s1);
			arr.add(s2);
		}
	}

	@Override
	public void first() {
		set();
		System.out.println(arr.get(0));
	}

	@Override
	public void all() {
		set();
		System.out.println(arr);
	}

}
