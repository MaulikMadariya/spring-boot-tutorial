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
@RequestMapping("/files")
public class fileController {

	private static final String FILE_URL = "C:\\image\\revise";

	@PostMapping("/fileUpload")
	public ResponseEntity<responseDto> fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
		File file2 = new File(FILE_URL);

		if (!file2.exists()) {
			file2.mkdir();
		}

		String fileName = file.getOriginalFilename();
		Path filePath = Paths.get(FILE_URL).resolve(fileName);

		responseDto dto = new responseDto();
		File file3 = new File(FILE_URL);
		
			Files.write(filePath, file.getBytes(), StandardOpenOption.CREATE);

			String fileDownloadUrl = ServletUriComponentsBuilder.fromCurrentContextPath().path("/files/fileDownload/")
					.path(fileName).toUriString();

			dto.setMsg("Succes...");
			dto.setData("Download File Click Here :- " + fileDownloadUrl);
			dto.setStatus(200);
		

		return new ResponseEntity<responseDto>(dto,HttpStatusCode.valueOf(dto.getStatus()));
	}
	@GetMapping("/fileDownload/{fileName}")
	public ResponseEntity<Object> fileDownload(@PathVariable("fileName") String fileName)
	{
		Path filePath = Paths.get(FILE_URL).resolve(fileName).normalize();
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
