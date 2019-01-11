package se.lexicon.CalculatorAS;

public class Count {

	public static String cou(double num1, double num2, String op) {
		String re = "";

		switch (op) {
		case "+":
			// write number to integer if is not a decimal.
			re = (PrintInt.g(num1) + " " + op + " " + PrintInt.g(num2) + " = " + PrintInt.g(num1 + num2));

			break;
		case "-":
			re = (PrintInt.g(num1) + " " + op + " " + PrintInt.g(num2) + " = " + PrintInt.g(num1 - num2));

			break;
		case "*":
			re = (PrintInt.g(num1) + " " + op + " " + PrintInt.g(num2) + " = " + PrintInt.g(num1 * num2));

			break;
		case "/":
			if (num2 == 0) {
				re = "Cannot division with 0.";

				break;
			}
			re = (PrintInt.g(num1) + " " + op + " " + PrintInt.g(num2) + " = " + PrintInt.g(num1 / num2));

			break;
		default:
			System.out.println("Not availdble operations.");
		}
		return re;

	}
}
