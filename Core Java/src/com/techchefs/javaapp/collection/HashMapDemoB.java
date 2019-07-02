package com.techchefs.javaapp.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemoB {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("One",1);
		hm.put("Two",2);
		hm.put("Three",3);
		hm.put("Four",4);
		System.out.println(".......Only keys ...........");
		Set<String> ts = hm.keySet();
		for(String s :ts)
		{
			System.out.println(s);
		}
		System.out.println(".......Only Values ...........");
		Collection<Integer> c = hm.values();
		Iterator<Integer> ic = c.iterator();
		while(ic.hasNext())
		{
			Integer i = ic.next();
			System.out.println(i);
		}
		/*
		 * for(Integer i : c) { System.out.println(i); }
		 */
		
		for(Map.Entry<String, Integer> e :hm.entrySet())
		{
			String key = e.getKey();
			Integer value = e.getValue();
			
			System.out.println("Key is    "+key);
			System.out.println("VAlue is    "+value);
			System.out.println("- - - - - - -- -  "+key);
		}
	}

}
