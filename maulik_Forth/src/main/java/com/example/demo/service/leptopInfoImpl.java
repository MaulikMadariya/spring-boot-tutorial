package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Leptop;

@Service
public class leptopInfoImpl implements leptopInfo {

	List arr = new ArrayList<>();

	public void set() {
		arr.clear();

		Leptop l = new Leptop();

		l.setLeptopName("Vestro");
		l.setBrand("dell");
		l.setPrice(50000);

		Leptop l1 = new Leptop();

		l1.setLeptopName("Insprince");
		l1.setBrand("dell");
		l1.setPrice(60000);

		Leptop l2 = new Leptop();

		l2.setLeptopName("Tuf Gaming");
		l2.setBrand("asus");
		l2.setPrice(70000);
	
		arr.add(l);
		arr.add(l1);
		arr.add(l2);

	}

	@Override
	public void all() {
		set();
		System.out.println(arr);
	}

	@Override
	public void first() {
		set();
		System.out.println(arr.get(0));
	}

}
