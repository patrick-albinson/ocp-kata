package patrick.ocp.calculator;

import patrick.ocp.calculator.evaluator.AdditionEvaluator;
import patrick.ocp.calculator.evaluator.DivisionEvaluator;
import patrick.ocp.calculator.evaluator.MultiplicationEvaluator;
import patrick.ocp.calculator.evaluator.SingleOperandEvaluator;
import patrick.ocp.calculator.evaluator.SubtractionEvaluator;
import patrick.ocp.calculator.evaluator.WhitespaceEvaluator;

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
