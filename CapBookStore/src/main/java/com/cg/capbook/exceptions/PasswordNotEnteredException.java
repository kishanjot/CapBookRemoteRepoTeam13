package com.cg.capbook.exceptions;

public class PasswordNotEnteredException extends Exception {

	public PasswordNotEnteredException() {
		super();
	}

	public PasswordNotEnteredException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PasswordNotEnteredException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordNotEnteredException(String message) {
		super(message);
	}

	public PasswordNotEnteredException(Throwable cause) {
		super(cause);
	}
}
