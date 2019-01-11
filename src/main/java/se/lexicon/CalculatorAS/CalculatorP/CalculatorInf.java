package se.lexicon.CalculatorAS.CalculatorP;

public interface CalculatorInf {

	double add(double n1, double n2);

	double sub(double n1, double n2);

	double div(double n1, double n2);

	double mul(double n1, double n2);

	default double calculate(double n1, double n2, String op) {
		switch (op) {
		case "+":
			return add(n1, n2);

		case "-":
			return sub(n1, n2);

		case "/":
			return div(n1, n2);

		case "*":
			return mul(n1, n2);
		default:
			throw new IllegalArgumentException("Wrong!!!");
		}
	}
}
