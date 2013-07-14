package patrick.ocp.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private List<MathematicalExpressionEvaluator> evaluators = new ArrayList<MathematicalExpressionEvaluator>();

	public int eval(String expression) {
		for (MathematicalExpressionEvaluator evaluator : evaluators) {
			if (evaluator.canEvaluate(expression)) {
				return evaluator.evaluate(expression);
			}
		}
		throw new UnsupportedOperationException("Unable to evaluate expression '" + expression + "'");
	}

	public void addEvaluator(MathematicalExpressionEvaluator operation) {
		evaluators.add(operation);
	}

}
