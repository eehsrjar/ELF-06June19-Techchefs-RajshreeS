package com.techchefs.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemoB {

	public static void main(String[] args) {
		LinkedHashSet<String> hs =new LinkedHashSet<String>();
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
