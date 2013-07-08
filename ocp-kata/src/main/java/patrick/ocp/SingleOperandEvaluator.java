package patrick.ocp;

import static java.lang.Integer.parseInt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SingleOperandEvaluator implements MathematicalExpressionEvaluator {
	
	private static final Pattern PATTERN = Pattern.compile("(\\d+)");

	public boolean canEvaluate(String expression) {
		return PATTERN.matcher(expression).matches();
	}

	public int eval(String expression) {
		Matcher matcher = PATTERN.matcher(expression);
		if (matcher.matches()) {
			return parseInt(matcher.group(1));
		}
		throw new IllegalArgumentException("Unable to evaluate expression '" + expression + "'");
	}


}
