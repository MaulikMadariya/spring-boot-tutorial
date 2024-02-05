package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.stockDto;
import com.example.demo.model.Stock;

public interface stockInfo {

	List<stockDto> all();

	void save(stockDto stockdto);

	void delete(Integer id);

	Map<String, Object> edit(Integer id);

//	Stock get(Integer id);
}
