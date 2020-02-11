package ru.chameleon.powerCalcPackage.exceptions;

public enum ExceptionCode {

	WRONG_FI("Угол может принимать значения тоько от 0 до 360 градусов"),
	SMALL_I("Величина тока не может принимать отрицательных значений"),
	SMALL_U("Величина напряжения не может принимать отрицательных значений"), BIG_I("Это слишком много. Предел 1000 А"),
	BIG_U("Это слишком много. Предел 1150000 В");

	private String exceptionString;

	ExceptionCode(String exceptionString) {
		this.exceptionString = exceptionString;
	}

	public String getExceptionString() {
		return exceptionString;
	}

}
