package com.techchefs.javaapp.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> lls= new LinkedList<>();
		lls.add("Meena");
		lls.add("Geena");
		lls.add("Heena");
		lls.add("Teena");
		lls.add("Ena");
		lls.add(2,"Seena");
		lls.addFirst("Veena");
		
		for(String s : lls)
		{
			System.out.println(s);
		}
	}

}
