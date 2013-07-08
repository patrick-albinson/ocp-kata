package patrick.ocp;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private List<MathematicalExpressionEvaluator> supportedOperations = new ArrayList<MathematicalExpressionEvaluator>();

	public int eval(String expression) {
		for (MathematicalExpressionEvaluator operation : supportedOperations) {
			if (operation.canEvaluate(expression)) {
				return operation.eval(expression);
			}
		}
		throw new UnsupportedOperationException("Unable to evaluate expression '" + expression + "'");
	}

	public void addOperation(MathematicalExpressionEvaluator operation) {
		supportedOperations.add(operation);
	}

}
