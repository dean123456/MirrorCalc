package ru.chameleon.powerCalcPackage.model;

import ru.chameleon.powerCalcPackage.exceptions.ExceptionCode;
import ru.chameleon.powerCalcPackage.exceptions.PowerCalcExceptions;

public class Input {
	private int i, u, fi;

	public Input(int i, int u, int fi) {
		this.i = i;
		this.u = u;
		this.fi = fi;
	}

	public int getI() {
		return i;
	}

	public int getU() {
		return u;
	}

	public int getFi() {
		return fi;
	}

	public Input validate() throws PowerCalcExceptions {
		if (fi < 0 || fi > 360)
			throw new PowerCalcExceptions(ExceptionCode.WRONG_FI);
		if (i < 0)
			throw new PowerCalcExceptions(ExceptionCode.SMALL_I);
		if (i > 1000)
			throw new PowerCalcExceptions(ExceptionCode.BIG_I);
		if (u < 0)
			throw new PowerCalcExceptions(ExceptionCode.SMALL_U);
		if (u > 1150000)
			throw new PowerCalcExceptions(ExceptionCode.BIG_U);
		return this;
	}
}
