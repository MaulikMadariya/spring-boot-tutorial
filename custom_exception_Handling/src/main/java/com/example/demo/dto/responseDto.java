package com.example.demo.dto;

public class responseDto {

	
	private int status;
	
	private Object Data;
	
	private String msg;

	public responseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public responseDto(int status, Object data, String msg) {
		super();
		this.status = status;
		Data = data;
		this.msg = msg;
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "responseDto [status=" + status + ", Data=" + Data + ", msg=" + msg + "]";
	}
	
	
}
