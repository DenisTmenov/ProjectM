package com.project.m.frame.exceptions;

public class FrameException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FrameException(String message, Throwable cause) {
		super(message, cause);
	}

	public FrameException(Throwable cause) {
		super(cause);
	}
	
	public FrameException(String message) {
		super(message);
	}

}
