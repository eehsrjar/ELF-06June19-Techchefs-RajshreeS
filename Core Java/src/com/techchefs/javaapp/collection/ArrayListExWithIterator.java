package com.techchefs.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExWithIterator {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(14);
		list.add(null);
		list.add(5.7);
		list.add('A');
		list.add("training");
		list.add('A');
		list.add(null);
		
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object o =it.next();
			System.out.println(o);
		}
	}

}
