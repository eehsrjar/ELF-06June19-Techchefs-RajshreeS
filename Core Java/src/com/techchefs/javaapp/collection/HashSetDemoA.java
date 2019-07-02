package com.techchefs.javaapp.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemoA {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Ram");
		hs.add("Sham");
		hs.add("Van");
		hs.add("Kan");
		hs.add("Pan");
		
		for(String s : hs)
		{
			System.out.println(s);
		}
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Object o =it.next();
			System.out.println(o);
		}
	}

}
