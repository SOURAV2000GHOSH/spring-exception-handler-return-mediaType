package com.springboot.exceptionhandler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponceEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Error employeeNotFoundException(EmployeeNotFoundException exception) {
		Error error = new Error(HttpStatus.NOT_FOUND, exception.getMessage());
		return error;

	}
	@ExceptionHandler(Exception.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public Error applicationException(Exception exception) {
		Error error=new Error(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage());
		return  error;
		
	}
}
