package com.springboot.exceptionhandler.exception;

import org.springframework.http.HttpStatus;

public class Error {
	private HttpStatus httpStatus;
	private String message;
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Error(HttpStatus httpStatus, String message) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
	}
	public Error() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
