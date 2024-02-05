package com.example.demo.dto;


public class responseDto {

	private String msg;
	
	private int status;
	
	private Object data;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "responseDto [msg=" + msg + ", status=" + status + ", data=" + data + "]";
	}

	public responseDto(String msg, int status, Object data) {
		super();
		this.msg = msg;
		this.status = status;
		this.data = data;
	}

	public responseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
