package ru.chameleon.powerCalcPackage.resources;

public enum Strings {
	FI("������� �������� ����:"), GRAD("(����);"), I("������� �������� ����:"), A("(�);"),
	U("������� �������� ����������:"), V("(�);"), COMPUTE("����������"), CLEAR("��������");

	private String s;

	Strings(String s) {
		this.s = s;
	}

	public String getStrings() {
		return s;
	}
}
