package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Manager;
import com.example.demo.service.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	@PostMapping("/addManager")
	public ResponseDto addManager(@RequestBody Manager manager , ResponseDto dto)
	{
		managerService.addManager(manager,dto);
		return dto;
	}
	
	@PutMapping("/editManager")
	public void editInternManagerById( @RequestParam("managerId") Integer managerId , @RequestParam("internId") Integer... internId )
	{
		managerService.editInternManagerById(managerId,internId);
		
	}
	
	@GetMapping("/showManager")
	public List<Manager> showManager()
	{
		return managerService.findAllManager();
	}
	
	
}








