package functions;

public class NumberInput {
	
	public double number1;
	public double number2;
	public String function;
	
	public NumberInput() {
	}
	
	public NumberInput(double number1, double number2, String function) {
		this.number1 = number1;
		this.number2 = number2;
		this.function = function;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	
	public String getFunction() {
		return function;
	}
	
	public void setFunction(String function) {
		this.function = function;
	}

}
