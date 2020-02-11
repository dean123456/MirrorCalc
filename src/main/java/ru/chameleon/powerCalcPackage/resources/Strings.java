package ru.chameleon.powerCalcPackage.resources;

public enum Strings {
	FI("Введите значение угла:"), GRAD("(град);"), I("Введите значение тока:"), A("(А);"),
	U("Введите значение напряжения:"), V("(В);"), COMPUTE("Рассчитать"), CLEAR("Очистить");

	private String s;

	Strings(String s) {
		this.s = s;
	}

	public String getStrings() {
		return s;
	}
}
