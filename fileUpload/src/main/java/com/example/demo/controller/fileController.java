package com.example.demo.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.dto.responseDto;

@Controller
@RequestMapping("/file")
public class fileController {

	private static final String DIR_PATH = "C:\\image\\Demo" ;
	
	@PostMapping("/upload")
	public ResponseEntity<responseDto> fileUpload (@RequestParam("file") MultipartFile file ) throws IOException
	{
		File dir = new File(DIR_PATH);
		if(!dir.exists())
		{
			dir.mkdir();
		}
		
		String fileName = file.getOriginalFilename();
		Path filePath = Paths.get(DIR_PATH).resolve(fileName);
		
		responseDto dto = new responseDto();
		File file1 = filePath.toFile();
		if(file1.exists())
		{
			dto.setMsg("Error....");
			dto.setData("File already Exists...");
			dto.setStatus(500);
		}
		else
		{
			Files.write(filePath, file.getBytes(), StandardOpenOption.CREATE);
			
			String fileDownloadUrl = ServletUriComponentsBuilder.fromCurrentContextPath().path("/file/download/").path(fileName).toUriString();
			
			
			dto.setMsg("Succes...");
			dto.setData("Download File Click Here :- "+fileDownloadUrl);
			dto.setStatus(200);
		}	
		return new ResponseEntity<responseDto>(dto,HttpStatusCode.valueOf(dto.getStatus())); 	
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	
	@GetMapping("/download/{fileName}")
	public ResponseEntity<Object> fileDownload(@PathVariable("fileName") String fileName)
	{
		Path filePath = Paths.get(DIR_PATH).resolve(fileName).normalize();
		File file = filePath.toFile();
		HttpHeaders headers = new HttpHeaders();
		if(file.exists())
		{
			
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.setContentDispositionFormData("Attach", fileName);
			
				
		}
		return ResponseEntity.ok().headers(headers).contentLength(file.length()).body(new FileSystemResource(file));
	}
}
