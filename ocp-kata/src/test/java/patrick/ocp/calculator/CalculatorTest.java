package patrick.ocp.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import patrick.ocp.calculator.Calculator;
import patrick.ocp.calculator.CalculatorFactory;

public class CalculatorTest {

	@Test
	public void treatingWhitespaceAsZero() {
		Calculator calc = new CalculatorFactory().create();
		assertEquals(0, calc.eval("    "));
	}

	@Test
	public void doingNothing() {
		Calculator calc = new CalculatorFactory().create();
		assertEquals(234, calc.eval("234"));
	}

	@Test
	public void simpleAddition() {
		Calculator calc = new CalculatorFactory().create();
		assertEquals(9, calc.eval("6 + 3"));
		assertEquals(46, calc.eval("12 + 34"));
	}

	@Test
	public void simpleSubtraction() {
		Calculator calc = new CalculatorFactory().create();
		assertEquals(3, calc.eval("6 - 3"));
		assertEquals(14, calc.eval("18 - 4"));
	}

	@Test
	public void simpleMultiplication() {
		Calculator calc = new CalculatorFactory().create();
		assertEquals(18, calc.eval("6 * 3"));
		assertEquals(110, calc.eval("5 * 22"));
	}

	@Test
	public void simpleDivision() {
		Calculator calc = new CalculatorFactory().create();
		assertEquals(2, calc.eval("6 / 3"));
		assertEquals(3, calc.eval("36 / 12"));
	}

}
