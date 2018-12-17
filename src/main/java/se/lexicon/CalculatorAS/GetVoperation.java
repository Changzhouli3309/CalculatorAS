package se.lexicon.CalculatorAS;

import java.util.Scanner;

public class GetVoperation {
	private static Scanner scan= new Scanner(System.in);
	public static String op() {
		String op=null;
		boolean v=false;
		
		while (!v) {
			
			switch (op=scan.nextLine()) {
			case "+":
			case "-":
			case "*":
			case "/":
				v=true;
				
			default:
				System.out.println("Not availdble operations.");
			}
		}
		return op;
	}
}
