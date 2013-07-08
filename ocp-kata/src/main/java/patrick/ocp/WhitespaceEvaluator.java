package patrick.ocp;

import java.util.regex.Pattern;

public class WhitespaceEvaluator implements MathematicalExpressionEvaluator {

	private static final Pattern PATTERN = Pattern.compile("\\s*");

	public boolean canEvaluate(String expression) {
		return PATTERN.matcher(expression).matches();
	}

	public int eval(String expression) {
		return 0;
	}
	
}
