package se.lexicon.CalculatorAS.CalculatorP;

public class CalculatorClass implements CalculatorInf {

	@Override
	public double add(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

	@Override
	public double sub(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

	@Override
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		if (n2 != 0) {
			return n1 / n2;
		} else {
			return 0;
		}
	}

	@Override
	public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}

}
