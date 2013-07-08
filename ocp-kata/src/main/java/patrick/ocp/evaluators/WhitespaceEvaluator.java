package patrick.ocp.evaluators;

import java.util.regex.Pattern;

import patrick.ocp.MathematicalExpressionEvaluator;

public class WhitespaceEvaluator implements MathematicalExpressionEvaluator {

	private static final Pattern PATTERN = Pattern.compile("\\s*");

	public boolean canEvaluate(String expression) {
		return PATTERN.matcher(expression).matches();
	}

	public int evaluate(String expression) {
		return 0;
	}
	
}
