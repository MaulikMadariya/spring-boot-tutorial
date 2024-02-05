package com.example.demo.service;

import com.example.demo.dto.ResponseDto;

public interface InternService {

	ResponseDto save(Integer internId,Integer managerId , ResponseDto dto);
}
