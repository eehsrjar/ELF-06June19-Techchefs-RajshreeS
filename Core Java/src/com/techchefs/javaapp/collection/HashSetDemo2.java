package com.techchefs.javaapp.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Hina");
		hs.add(12);
		hs.add('E');
		hs.add(5.8);
		hs.add(null);
		hs.add(12);
		hs.add(null);
		
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
