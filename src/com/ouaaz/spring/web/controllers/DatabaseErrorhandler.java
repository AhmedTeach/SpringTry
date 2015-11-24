package com.ouaaz.spring.web.controllers;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DatabaseErrorhandler {
	
	@ExceptionHandler(DataAccessException.class)
	public String handleDBException(DataAccessException ex){
		
		return "error";
	}
}
