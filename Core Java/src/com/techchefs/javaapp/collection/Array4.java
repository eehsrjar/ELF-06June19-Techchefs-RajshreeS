package com.techchefs.javaapp.collection;

import java.util.ArrayList;

public class Array4 {

	public static void main(String[] args) {
		ArrayList<Double> l = new ArrayList<Double>();
		l.add(9.2);
		l.add(1.6);
		l.add(6.9);
		l.add(2.4);
		l.add(3.6);
		
		System.out.println("Before ----->"+l);
		
		boolean res=l.remove(12.4);
		System.out.println("Result is "+res);
		System.out.println("After ----->"+l);
	}

}
