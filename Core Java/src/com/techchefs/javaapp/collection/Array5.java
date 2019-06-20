package com.techchefs.javaapp.collection;

import java.util.ArrayList;

public class Array5 {

	public static void main(String[] args) {
		ArrayList<Double> l = new ArrayList<Double>();
		l.add(9.2);
		l.add(1.6);
		l.add(6.9);
		l.add(2.4);
		l.add(3.6);
		
		ArrayList<Double> l1 = new ArrayList<Double>();
		l1.add(19.2);
		l1.add(1.56);
		
		System.out.println("Before ----->"+l);
		
		l.addAll(l1);
		
		System.out.println("After ----->"+l);
	}

}
