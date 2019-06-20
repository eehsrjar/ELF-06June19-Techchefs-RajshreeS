package com.techchefs.javaapp.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
		LinkedHashMap<Character, Double> lm = new LinkedHashMap<Character, Double>();
		
		lm.put('A',90.50);
		lm.put('B',80.00);
		lm.put('C',70.70);
		lm.put('D',60.00);
		
		for(Map.Entry<Character, Double> e :lm.entrySet())
		{
			Character key = e.getKey();
			Double value = e.getValue();
			
			System.out.println("Key is    "+key);
			System.out.println("VAlue is    "+value);
			System.out.println("- - - - - - -- -  ");
		}
	}

}
