package com.example.demo.dto;

public class responseDto {

	private int Status;
	
	private String msg;
	
	private Object Data;

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return Data;
	}

	public void setData(Object data) {
		Data = data;
	}

	public responseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public responseDto(int status, String msg, Object data) {
		super();
		Status = status;
		this.msg = msg;
		Data = data;
	}

	@Override
	public String toString() {
		return "responseDto [Status=" + Status + ", msg=" + msg + ", Data=" + Data + "]";
	}
		
	
}
