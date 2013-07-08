package patrick.ocp;

public interface MathematicalExpressionEvaluator {

	boolean canEvaluate(String expression);
	
	int evaluate(String expression);
	
}
