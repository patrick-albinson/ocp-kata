package patrick.ocp;

public class CalculatorFactory {

	public Calculator create() {
		Calculator calculator = new Calculator();
		calculator.addOperation(new AdditionOperation());
		calculator.addOperation(new DivisionOperation());
		calculator.addOperation(new MultiplicationOperation());
		calculator.addOperation(new SubtractionOperation());
		calculator.addOperation(new SingleOperandOperation());
		calculator.addOperation(new ZeroOperandOperation());
		return calculator;
	}

}
