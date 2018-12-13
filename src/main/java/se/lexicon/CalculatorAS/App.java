package se.lexicon.CalculatorAS;

public class App 
{
	
	public static void main( String[] args ){
		
		double n1=0,n2=0;
		boolean runing=true;
		
		System.out.println("Welcome to Caculator!");
		
		while (runing) {
			//get 2 numbers
			System.out.print("Number1 :");
			n1=GetVdouble.getVD();
			System.out.print("Number2 :");
			n2=GetVdouble.getVD();
			
			System.out.println("(+,-,*,/)");
			System.out.print("Operation :");
			
			//get operation, do the counting and show the result.
			Count.cou(n1, n2);
			
			//ask for next calculate.
			System.out.println("Next counting?(y/n)");
			runing=YesOrNo.anwer();
		}
		System.out.println("Goodbye!");
	}
	
}
