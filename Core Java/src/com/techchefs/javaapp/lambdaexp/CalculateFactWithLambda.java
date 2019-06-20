package com.techchefs.javaapp.lambdaexp;

public class CalculateFactWithLambda {

	public static void main(String[] args) {
		Factorial f = a -> {
			int i= 1;
			for(int j=1;j<=a;j++)
			{
				i=i*j;
			}
			return i;
		}; 
		
		int res = f.fact(5);
		System.out.println(res);
	}

}
