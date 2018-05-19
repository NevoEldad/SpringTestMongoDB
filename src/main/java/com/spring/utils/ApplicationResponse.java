package com.spring.utils;

public class ApplicationResponse {

	private long id;
	private String message;

	public ApplicationResponse(long id, String message) {
		this.id = id;
		this.message = message;
	}

	public ApplicationResponse() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
