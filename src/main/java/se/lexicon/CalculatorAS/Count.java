package se.lexicon.CalculatorAS;

import java.util.Scanner;
//get the operation and do the counting
//also show the result
public class Count {
	private static Scanner scan= new Scanner(System.in);
	public static void cou(double num1,double num2) {
		String op;
		boolean v=false;
		
		while (!v) {
			op=scan.nextLine();
			switch (op) {
			case "+":
				System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 + num2));
				v=true;
				break;
			case "-":
				System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2));
				v=true;
				break;
			case "*":
				v=true;
				System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 * num2));
				break;
			case "/":
				if(num2==0) {
					System.out.println("Cannot division with 0.");
					v=true;
					break;
				}
				System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 / num2));
				v=true;
				break;
			default:
				System.out.println("Not availdble operations.");
			}
		}
        
    }
}
