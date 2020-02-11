package ru.chameleon.powerCalcPackage.exceptions;

public class PowerCalcExceptions extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String exception;

	public PowerCalcExceptions(ExceptionCode exceptionCode) {
		super(exceptionCode.getExceptionString());
		exception = exceptionCode.getExceptionString();
	}

	public String getException() {
		return exception;
	}
}
