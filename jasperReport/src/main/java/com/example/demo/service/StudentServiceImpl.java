package com.example.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;



@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Override
	public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
		List<Student> student1 = repo.findAll();
		
		File file = ResourceUtils.getFile("classpath:student1.jrxml");
		JasperReport jasperReport=JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(student1);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,null, dataSource);
		
		//html
		if(reportFormat.equalsIgnoreCase("html")) {
			JasperExportManager.exportReportToHtmlFile(jasperPrint,"C:\\Users\\maulikmadariya\\OneDrive - VASYERP SOLUTIONS PVT LTD\\Documents"+"\\student.html");
		}
		
		//PDf 
		if(reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint,"C:\\Users\\maulikmadariya\\OneDrive - VASYERP SOLUTIONS PVT LTD\\Documents"+"\\student.pdf");
		}
		
		//csv File 
		if(reportFormat.equalsIgnoreCase("csv")) {
//			JasperExportManager.exportReportToXmlFile(jasperPrint,"C:\\Users\\maulikmadariya\\OneDrive - VASYERP SOLUTIONS PVT LTD\\Documents"+"\\student.xml",true);
			
			JRXlsxExporter exporter = new JRXlsxExporter();
			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			exporter.setExporterOutput( new SimpleOutputStreamExporterOutput("C:\\Users\\maulikmadariya\\OneDrive - VASYERP SOLUTIONS PVT LTD\\Documents"+"\\student.csv"));
			exporter.exportReport();
		}
		
		//xls File
		if(reportFormat.equalsIgnoreCase("xls")) {
			JRXlsxExporter exporter = new JRXlsxExporter();
			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			exporter.setExporterOutput( new SimpleOutputStreamExporterOutput("C:\\Users\\maulikmadariya\\OneDrive - VASYERP SOLUTIONS PVT LTD\\Documents"+"\\student.xls"));
			exporter.exportReport();
		}
		return "Report Genrated in path C:\\\\Users\\\\maulikmadariya\\\\OneDrive - VASYERP SOLUTIONS PVT LTD\\\\Documents";
	}

}
