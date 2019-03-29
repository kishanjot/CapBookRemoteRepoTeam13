package com.cg.capbook.exceptions;

public class UserDetailsNotFoundException extends Exception {

	public UserDetailsNotFoundException() {
		super();
	}

	public UserDetailsNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public UserDetailsNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UserDetailsNotFoundException(String arg0) {
		super(arg0);
	}

	public UserDetailsNotFoundException(Throwable arg0) {
		super(arg0);
	}
}
