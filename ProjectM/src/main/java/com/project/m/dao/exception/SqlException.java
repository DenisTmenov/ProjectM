package com.project.m.dao.exception;

public class SqlException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SqlException(String message, Throwable cause) {
		super(message, cause);
	}

	public SqlException(Throwable cause) {
		super(cause);
	}

	public SqlException(String message) {
		super(message);
	}

}
