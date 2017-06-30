package com.project.m.utils.exceptions;

public class ExceptionUtils extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExceptionUtils(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionUtils(Throwable cause) {
		super(cause);
	}
	
	public ExceptionUtils(String message) {
		super(message);
	}

}
