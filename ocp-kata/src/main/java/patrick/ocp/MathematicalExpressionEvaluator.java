package patrick.ocp;

public interface MathematicalExpressionEvaluator {

	boolean canEvaluate(String expression);
	
	int eval(String expression);
	
}
