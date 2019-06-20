package com.techchefs.javaapp.collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(45);
		l.add(5);
		l.add(40);
		
		for(int i=0;i<l.size();i++)
		{
			Integer d=l.get(i);
			System.out.println(d);
		}
	}

}
