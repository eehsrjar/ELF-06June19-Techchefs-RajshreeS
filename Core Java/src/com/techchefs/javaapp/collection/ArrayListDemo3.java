package com.techchefs.javaapp.collection;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Double> l = new ArrayList<Double>();
		l.add(45.1);
		l.add(5.0);
		l.add(40.1);
		
		for(Double d : l)
		{
			System.out.println(d);
		}
	}

}
