package com.cg.capbook.exceptions;

public class PasswordMismatchException extends Exception {

	public PasswordMismatchException() {
		super();
	}

	public PasswordMismatchException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public PasswordMismatchException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public PasswordMismatchException(String arg0) {
		super(arg0);
	}

	public PasswordMismatchException(Throwable arg0) {
		super(arg0);
	}
}
