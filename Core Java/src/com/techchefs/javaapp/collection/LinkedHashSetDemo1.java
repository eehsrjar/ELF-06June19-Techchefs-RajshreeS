package com.techchefs.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("Hina");
		hs.add(12);
		hs.add('E');
		hs.add(5.8);
		
		for(Object o : hs)
		{
			System.out.println(o);
		}
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Object o =it.next();
			System.out.println(o);
		}
	}

}
