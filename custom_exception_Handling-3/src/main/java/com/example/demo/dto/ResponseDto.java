package com.example.demo.dto;



public class ResponseDto {
	
	private int status;
	
	private String mesage;
	
	private Object data;

	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseDto(int status, String mesage, Object data) {
		super();
		this.status = status;
		this.mesage = mesage;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDto [status=" + status + ", mesage=" + mesage + ", data=" + data + "]";
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMesage() {
		return mesage;
	}

	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
	
}
