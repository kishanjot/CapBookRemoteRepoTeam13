package com.cg.capbook.exceptions;

public class FriendAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	public FriendAlreadyExistsException() {
		super();
	}

	public FriendAlreadyExistsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FriendAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public FriendAlreadyExistsException(String message) {
		super(message);
	}

	public FriendAlreadyExistsException(Throwable cause) {
		super(cause);
	}

}
