package com.techchefs.javaapp.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("One",1);
		tm.put("Two",2);
		tm.put("Three",3);
		tm.put("Four",4);
		
		for(Map.Entry<String, Integer> e :tm.entrySet())
		{
			String key = e.getKey();
			Integer value = e.getValue();
			
			System.out.println("Key is    "+key);
			System.out.println("VAlue is    "+value);
			System.out.println("- - - - - - -- -  ");
		}
	}

}
