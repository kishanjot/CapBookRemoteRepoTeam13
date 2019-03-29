package com.cg.capbook.exceptions;

public class IncorrectSecurityAnswer extends Exception {

	public IncorrectSecurityAnswer() {
		super();
	}

	public IncorrectSecurityAnswer(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public IncorrectSecurityAnswer(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public IncorrectSecurityAnswer(String arg0) {
		super(arg0);
	}

	public IncorrectSecurityAnswer(Throwable arg0) {
		super(arg0);
	}
}
