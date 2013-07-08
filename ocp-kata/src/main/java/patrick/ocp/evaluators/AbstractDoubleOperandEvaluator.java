package patrick.ocp.evaluators;

import static java.lang.Integer.parseInt;

import java.util.regex.Matcher;

import patrick.ocp.MathematicalExpressionEvaluator;

public abstract class AbstractDoubleOperandEvaluator implements MathematicalExpressionEvaluator {

	protected abstract Matcher getMatcher(String expression);

	protected abstract int performCalculation(int operandOne, int operandTwo);

	public boolean canEvaluate(String expression) {
		return getMatcher(expression).matches();
	}

	public int evaluate(String expression) {
		Matcher matcher = getMatcher(expression);
		if (matcher.matches()) {
			int operandOne = parseInt(matcher.group(1));
			int operandTwo = parseInt(matcher.group(2));
			return performCalculation(operandOne, operandTwo);
		}
		throw new IllegalArgumentException("Unable to evaluate expression '" + expression + "'");
	}

}
