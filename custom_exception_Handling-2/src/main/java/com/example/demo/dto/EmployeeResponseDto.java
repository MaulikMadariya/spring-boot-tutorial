package com.example.demo.dto;

public class EmployeeResponseDto {
	
	private int status;
	
	private Object Data;
	
	private String message;

	@Override
	public String toString() {
		return "EmployeeResponseDto [status=" + status + ", Data=" + Data + ", message=" + message + "]";
	}

	public EmployeeResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeResponseDto(int status, Object data, String message) {
		super();
		this.status = status;
		Data = data;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return Data;
	}

	public void setData(Object data) {
		Data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
