package com.techchefs.javaapp.collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(14);
		list.add(5.7);
		list.add('A');
		list.add("training");
		
		for(int i=0;i<list.size();i++)
		{
			Object o=list.get(i);
			System.out.println(o);
		}
	}

}
