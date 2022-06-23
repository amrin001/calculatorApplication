package calculator;

import java.util.Scanner;

import functions.CalculatorProgram;

public class CalculatorApplication {

	public static void main(String[] args) {

		double result = 0;

		System.out.println("Input your first number: ");
		Scanner input1 = new Scanner(System.in);
		double number1 = input1.nextDouble();

		System.out.println("Input your function: ");
		Scanner inputFunc = new Scanner(System.in);
		String function = inputFunc.nextLine();

		System.out.println("Input your second number: ");
		Scanner input2 = new Scanner(System.in);
		double number2 = input2.nextDouble();
		
//		System.out.println("Input your function: ");
//		Scanner inputFunc2 = new Scanner(System.in);
//		String function2 = inputFunc2.nextLine();
		
		CalculatorProgram calculatorProg = new CalculatorProgram();
		result = calculatorProg.calcProg(number1, number2, function);
		
		System.out.println("The result is " + result);

		while (true) {
			
			System.out.println("Input your function: ");
			Scanner inputFunc3 = new Scanner(System.in);
			String function3 = inputFunc3.nextLine();
			
			if (function3.equals("=")) {
				System.out.println("The final result is " + result);
				break;
			}

			System.out.println("Current result is: " + result);
			System.out.println("Input your next number: ");
			Scanner input3 = new Scanner(System.in);
			double newNumber = input3.nextDouble();

			System.out.println("Initial answer is: " + result);
			result = calculatorProg.calcProg(result, newNumber, function3);

			System.out.println("The final result is " + result);
		}

	}

}
