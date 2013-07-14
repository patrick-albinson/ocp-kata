package patrick.ocp.calculator;

public interface MathematicalExpressionEvaluator {

	boolean canEvaluate(String expression);
	
	int evaluate(String expression);
	
}
