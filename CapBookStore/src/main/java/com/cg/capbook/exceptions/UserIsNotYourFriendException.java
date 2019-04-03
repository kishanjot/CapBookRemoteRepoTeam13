package com.cg.capbook.exceptions;

public class UserIsNotYourFriendException extends Exception {

	public UserIsNotYourFriendException() {
		super();
	}

	public UserIsNotYourFriendException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public UserIsNotYourFriendException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UserIsNotYourFriendException(String arg0) {
		super(arg0);
	}

	public UserIsNotYourFriendException(Throwable arg0) {
		super(arg0);
	}
}
