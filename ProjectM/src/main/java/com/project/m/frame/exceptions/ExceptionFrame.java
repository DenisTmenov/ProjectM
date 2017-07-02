package com.project.m.frame.exceptions;

public class ExceptionFrame extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExceptionFrame(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionFrame(Throwable cause) {
		super(cause);
	}
	
	public ExceptionFrame(String message) {
		super(message);
	}

}
