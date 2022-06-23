package functions;

public class CalculatorProgram {
	
	public double calcProg(double input1, double input2, String function) {
		
		CalculatorFunctions result = new CalculatorFunctions();
		double answer = 0;
		
		switch (function) {
		
		case "+":
			answer = result.additionFunction(input1, input2);
			break;
			
		case "-":
			answer = result.subtractionFunction(input1, input2);
			break;
			
		case "*":
			answer = result.multiplyFunction(input1, input2);
			break;
			
		case "/":
			answer = result.divideFunction(input1, input2);
			break;
			
//		case "=":
//			break;
			
		}
		return answer;
		
	}

}
