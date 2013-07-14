package patrick.ocp.calculator.evaluator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import patrick.ocp.calculator.MathematicalExpressionEvaluator;

public class DivisionEvaluator extends AbstractDoubleOperandEvaluator implements MathematicalExpressionEvaluator {

	private static final Pattern PATTERN = Pattern.compile("(\\d+) / (\\d+)");

	@Override
	protected Matcher getMatcher(String expression) {
		return PATTERN.matcher(expression);
	}

	@Override
	protected int performCalculation(int operandOne, int operandTwo) {
		return operandOne / operandTwo;
	}

}
