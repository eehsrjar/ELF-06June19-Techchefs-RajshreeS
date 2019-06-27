package com.techchefs.javaapp.referenceoperator;

public class FactorialTest {

	public static void main(String[] args) {
		CalculateFactorial c= new CalculateFactorial();
		
		MyFactorial m = c :: fact;
		
		int res = m.myFact(4);
		System.out.println("Factorial is "+res);
	}

}
