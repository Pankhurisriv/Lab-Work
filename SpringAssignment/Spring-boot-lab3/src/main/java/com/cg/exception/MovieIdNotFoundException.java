package com.cg.exception;

public class MovieIdNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public MovieIdNotFoundException() {
		super();
	}
	
	public MovieIdNotFoundException(String message) {
		super(message);
	}

}
