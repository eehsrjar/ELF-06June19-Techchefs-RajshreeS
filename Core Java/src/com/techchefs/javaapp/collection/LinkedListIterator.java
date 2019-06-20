package com.techchefs.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {

	public static void main(String[] args) {
		LinkedList<String> lls= new LinkedList<>();
		lls.add("Meena");
		lls.add("Geena");
		lls.add("Heena");
		lls.add("Teena");
		lls.add("Ena");
		lls.add(2,"Seena");
		lls.addFirst("Veena");
		
		Iterator<String> it = lls.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
	}

}
