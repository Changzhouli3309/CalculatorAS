package se.lexicon.CalculatorAS;

import java.util.Scanner;
//get the yes or no answer, don't get anything else.
public class YesOrNo {
	private static Scanner scan= new Scanner(System.in);
	
	public static boolean anwer() {
		
		boolean valid = false, res=true;
		while(!valid) {
			
			switch (scan.nextLine()) {
			case "y":
				valid = true;
				res=true;
				break;
			case "n":
				valid = true;
				res=false;
				break;
			default:
				System.out.println("Not enter avalidable enter.(y/n)");
				
			}
		}
		return res;
			
	}
}
