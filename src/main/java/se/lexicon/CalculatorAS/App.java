package se.lexicon.CalculatorAS;

public class App 
{
    public static void main( String[] args )
    {
    	int sum = 0;
    	
        for(int i=1;i<6;i++) {
        	if (i==1) {
        		System.out.print(i);
        		sum+=i;
        	}else if (i==5) {
        		sum+=i;
        		System.out.print("+"+i+"="+sum);
        	}else {
        		sum+=i;
        		System.out.print("+"+i);
        	}
        	
        }
    }
}
