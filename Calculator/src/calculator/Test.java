package calculator;

import java.util.ArrayList;
import java.util.Scanner;

import functions.CalculatorFunctions;
import functions.CalculatorProgram;

public class Test {

	public static void main(String[] args) {
//		String bodmas = "6+7*2-8+6/2-1";
		Scanner scanner = new Scanner(System.in);
		String bodmas = scanner.nextLine();
		String[] tempArr = bodmas.split("");
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < tempArr.length; i++)
			arr.add(tempArr[i]);

		System.out.println(arr);

		// to do up * and /
		for (int i = 0; i < arr.size(); i++) {
			double result = 0;
			if (arr.get(i).contains("*")) {
				result = new CalculatorFunctions().multiplyFunction(Double.parseDouble(arr.get(i - 1)),
						(Double.parseDouble(arr.get(i + 1))));
				arr.set(i, Double.toString(result));
				arr.remove(i - 1);
				arr.remove(i);
			} else if (arr.get(i).contains("/")) {
				result = new CalculatorFunctions().divideFunction(Double.parseDouble(arr.get(i - 1)),
						(Double.parseDouble(arr.get(i + 1))));
				arr.set(i, Double.toString(result));
				arr.remove(i - 1);
				arr.remove(i);
			}
		}

		System.out.println(arr);

		// to do up + and -
		while (arr.size() > 1) {
			for (int j = 1; j < arr.size();) {
				double result = 0;
				result = new CalculatorProgram().calcProg(Double.parseDouble(arr.get(j - 1)),
						(Double.parseDouble(arr.get(j + 1))), arr.get(j));
				System.out.println(arr.get(j - 1) + " " + arr.get(j) + " " + (arr.get(j + 1)) + " = " + " " + result);
				arr.set(j, Double.toString(result));
				arr.remove(j - 1);
				arr.remove(j);
//				System.out.println(arr);
				break;

			}
		}

		System.out.println(arr);
	}

}
