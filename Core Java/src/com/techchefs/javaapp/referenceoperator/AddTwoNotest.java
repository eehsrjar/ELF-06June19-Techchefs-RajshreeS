package com.techchefs.javaapp.referenceoperator;

public class AddTwoNotest {

	public static void main(String[] args) {
		AddTwoNo t = DemoForAddition :: add;
		int res=t.sum(3, 3);
		System.out.println("Addition is "+res);
	}
	
//	static void add(int a,int b) {
//		int c= a+b;
//		System.out.println("Addition is "+c);
//	}

}
