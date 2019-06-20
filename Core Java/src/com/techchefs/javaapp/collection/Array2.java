package com.techchefs.javaapp.collection;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		ArrayList<Double> l = new ArrayList<Double>();
		l.add(9.2);
		l.add(1.6);
		l.add(6.9);
		l.add(2.4);
		l.add(3.6);
		
		System.out.println("Before ---->"+l);
		
		Double d=l.set(2,5.6);
		System.out.println(d);
		
		System.out.println("After ----->"+l);
	}

}
