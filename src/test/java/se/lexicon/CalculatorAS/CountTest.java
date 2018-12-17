package se.lexicon.CalculatorAS;

import org.junit.Test;

import org.junit.Assert;

public class CountTest {
	
	@Test 
	public void test_Addition() {
		double num1=1,num2=2;
		String op="+";
		
		String expected =(PrintInt.g(num1) + " " + op + " " + PrintInt.g(num2) + " = " + PrintInt.g(3));
		
		String actual = Count.cou(num1, num2, op);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test 
	public void test_division_Zero() {
		double num1=1,num2=0;
		String op="/";
		
		String expected ="Cannot division with 0.";
		
		String actual = Count.cou(num1, num2, op);
		
		Assert.assertEquals(expected, actual);
		
	}
	
}
