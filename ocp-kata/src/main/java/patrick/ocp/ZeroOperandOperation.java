package patrick.ocp;

import java.util.regex.Pattern;

public class ZeroOperandOperation implements MathematicalExpressionHandler {

	private static final Pattern PATTERN = Pattern.compile("\\s*");

	public boolean canHandle(String expression) {
		return PATTERN.matcher(expression).matches();
	}

	public int eval(String expression) {
		return 0;
	}
	
}
