package com.cg.capbook.exceptions;

public class BothPasswordsSameException extends Exception {

	public BothPasswordsSameException() {
		super();
	}

	public BothPasswordsSameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BothPasswordsSameException(String message, Throwable cause) {
		super(message, cause);
	}

	public BothPasswordsSameException(String message) {
		super(message);
	}

	public BothPasswordsSameException(Throwable cause) {
		super(cause);
	}
}
