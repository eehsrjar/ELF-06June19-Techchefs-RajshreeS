package com.techchefs.javaapp.collection;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(14);
		list.add(null);
		list.add(5.7);
		list.add('A');
		list.add("training");
		list.add('A');
		list.add(null);
		
		for(Object o : list)
		{
			System.out.println(o);
		}
	}

}
