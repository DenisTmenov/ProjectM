package com.project.m.exceptions;

public class DboException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DboException(String message, Throwable cause) {
		super(message, cause);
	}

	public DboException(Throwable cause) {
		super(cause);
	}

	public DboException(String message) {
		super(message);
	}

}
