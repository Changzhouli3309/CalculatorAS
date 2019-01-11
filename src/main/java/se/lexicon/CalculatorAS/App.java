package se.lexicon.CalculatorAS;

import se.lexicon.CalculatorAS.CalculatorP.CalculatorClass;

public class App {
	public static void main(String[] args) {
		CalculatorClass cal = new CalculatorClass();
		double n1 = 0, n2 = 0;
		boolean runing = true;

		System.out.println("Welcome to Caculator!");

		while (runing) {
			// Get 2 numbers
			System.out.print("Number1 :");
			n1 = GetVdouble.getVD();
			System.out.print("Number2 :");
			n2 = GetVdouble.getVD();

			System.out.println("(+,-,*,/ only)");
			System.out.print("Operation :");

			// Ask for operation, do the counting and show the result.
			System.out.println(PrintInt.g(cal.calculate(n1, n2, GetVoperation.op())));

			// Ask for next calculate.
			System.out.println("Next counting?(y/n)");
			runing = YesOrNo.anwer();
		}
		System.out.println("Goodbye!");
	}

}
