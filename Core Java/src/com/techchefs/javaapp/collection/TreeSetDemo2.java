package com.techchefs.javaapp.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<String> hs =new TreeSet<String>();
		hs.add("Ram");
		hs.add("Sham");
		hs.add("Van");
		hs.add("Pan");
		hs.add("Pan");
		
		for(String s : hs)
		{
			System.out.println(s);
		}
		
//		Iterator it = hs.iterator();
//		while(it.hasNext())
//		{
//			Object o =it.next();
//			System.out.println(o);
//		}
	}

}
