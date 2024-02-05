package com.example.demo.service;

import java.io.FileNotFoundException;

import net.sf.jasperreports.engine.JRException;

public interface StudentService {

	String exportReport(String reportFormat) throws FileNotFoundException, JRException;
}
