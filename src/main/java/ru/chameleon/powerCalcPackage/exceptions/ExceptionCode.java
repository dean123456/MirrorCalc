package ru.chameleon.powerCalcPackage.exceptions;

public enum ExceptionCode {

	WRONG_FI("���� ����� ��������� �������� ����� �� 0 �� 360 ��������"),
	SMALL_I("�������� ���� �� ����� ��������� ������������� ��������"),
	SMALL_U("�������� ���������� �� ����� ��������� ������������� ��������"), BIG_I("��� ������� �����. ������ 1000 �"),
	BIG_U("��� ������� �����. ������ 1150000 �");

	private String exceptionString;

	ExceptionCode(String exceptionString) {
		this.exceptionString = exceptionString;
	}

	public String getExceptionString() {
		return exceptionString;
	}

}
