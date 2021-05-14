package com.cag.controller;

import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.cag.exception.TraineeIdNotFoundException;

public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = {TraineeIdNotFoundException.class})
			public ResponseEntity<Object> handleIdNotFoundExceptions(Exception exp){
				return new ResponseEntity<Object>(exp.getMessage(), HttpStatus.BAD_REQUEST);
			}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> handleAnyException(Exception exp){
		return new ResponseEntity<Object>(exp.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	static String messageFrom(BindingResult result) {		
		return result.getAllErrors().stream()
				.map(err -> err.getObjectName() + "-"+err.getDefaultMessage())
				.collect(Collectors.toList()).toString();
	}

}
