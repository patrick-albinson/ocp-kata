package patrick.ocp;

public interface MathematicalExpressionHandler {

	boolean canHandle(String expression);
	
	int eval(String expression);
	
}
