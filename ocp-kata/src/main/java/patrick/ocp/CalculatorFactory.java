package patrick.ocp;

public class CalculatorFactory {

	public Calculator create() {
		Calculator calculator = new Calculator();
		calculator.addOperation(new AdditionEvaluator());
		calculator.addOperation(new DivisionEvaluator());
		calculator.addOperation(new MultiplicationEvaluator());
		calculator.addOperation(new SubtractionEvaluator());
		calculator.addOperation(new SingleOperandEvaluator());
		calculator.addOperation(new WhitespaceEvaluator());
		return calculator;
	}

}
