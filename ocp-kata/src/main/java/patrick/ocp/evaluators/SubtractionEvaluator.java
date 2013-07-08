package patrick.ocp.evaluators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import patrick.ocp.MathematicalExpressionEvaluator;

public class SubtractionEvaluator extends AbstractDoubleOperandEvaluator implements MathematicalExpressionEvaluator {

	private static final Pattern PATTERN = Pattern.compile("(\\d+) - (\\d+)");

	@Override
	protected Matcher getMatcher(String expression) {
		return PATTERN.matcher(expression);
	}

	@Override
	protected int performCalculation(int operandOne, int operandTwo) {
		return operandOne - operandTwo;
	}

}
