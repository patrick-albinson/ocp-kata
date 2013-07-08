package patrick.ocp;

import patrick.ocp.evaluators.AdditionEvaluator;
import patrick.ocp.evaluators.DivisionEvaluator;
import patrick.ocp.evaluators.MultiplicationEvaluator;
import patrick.ocp.evaluators.SingleOperandEvaluator;
import patrick.ocp.evaluators.SubtractionEvaluator;
import patrick.ocp.evaluators.WhitespaceEvaluator;

public class CalculatorFactory {

	public Calculator create() {
		Calculator calculator = new Calculator();
		calculator.addEvaluator(new AdditionEvaluator());
		calculator.addEvaluator(new DivisionEvaluator());
		calculator.addEvaluator(new MultiplicationEvaluator());
		calculator.addEvaluator(new SubtractionEvaluator());
		calculator.addEvaluator(new SingleOperandEvaluator());
		calculator.addEvaluator(new WhitespaceEvaluator());
		return calculator;
	}

}
