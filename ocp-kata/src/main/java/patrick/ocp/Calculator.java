package patrick.ocp;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private List<MathematicalExpressionHandler> supportedOperations = new ArrayList<MathematicalExpressionHandler>();

	public int eval(String expression) {
		for (MathematicalExpressionHandler operation : supportedOperations) {
			if (operation.canHandle(expression)) {
				return operation.eval(expression);
			}
		}
		throw new UnsupportedOperationException("Unable to evaluate expression '" + expression + "'");
	}

	public void addOperation(MathematicalExpressionHandler operation) {
		supportedOperations.add(operation);
	}

}
