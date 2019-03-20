package com.cg.capbook.exceptions;

public class FriendAlreadyExistsException extends Exception {

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
