package ru.chameleon.powerCalcPackage.out;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.chameleon.powerCalcPackage.exceptions.PowerCalcExceptions;
import ru.chameleon.powerCalcPackage.model.Input;

public class TestInput {
	@Test
	public void testInput() {
		Input input = new Input(10, 220, 30);
		assertEquals(30, input.getFi());
		assertEquals(10, input.getI());
		assertEquals(220, input.getU());
	}

	@Test(expected = PowerCalcExceptions.class)
	public void testInputLessThenZeroFi() throws PowerCalcExceptions {
		Input input = new Input(10, 220, -3);
		input.validate();
	}

	@Test(expected = PowerCalcExceptions.class)
	public void testInputGraterThen360Fi() throws PowerCalcExceptions {
		Input input = new Input(10, 220, 361);
		input.validate();
	}

	@Test(expected = PowerCalcExceptions.class)
	public void testInputSmallI() throws PowerCalcExceptions {
		Input input = new Input(-1, 220, 30);
		input.validate();
	}

	@Test(expected = PowerCalcExceptions.class)
	public void testInputBigI() throws PowerCalcExceptions {
		Input input = new Input(1001, 220, 30);
		input.validate();
	}

	@Test(expected = PowerCalcExceptions.class)
	public void testInputSmallU() throws PowerCalcExceptions {
		Input input = new Input(10, -2, 30);
		input.validate();
	}

	@Test(expected = PowerCalcExceptions.class)
	public void testInputBigU() throws PowerCalcExceptions {
		Input input = new Input(10, 1150001, 30);
		input.validate();
	}
}
