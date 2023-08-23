package com.example.springbootwithmongodb.model;

import org.springframework.stereotype.Component;

@Component
public class MyResponse {
	private String message;

	public MyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
