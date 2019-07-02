package com.techchefs.javaapp.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemoD {

	public static void main(String[] args) {
		ArrayList<String> lls= new ArrayList<>();
		lls.add("Meena");
		lls.add("Geena");
		lls.add("Heena");
		lls.add("Teena");
		lls.add("Ena");
		lls.add(2,"Seena");
		
		ListIterator< String > ll=lls.listIterator();
		while(ll.hasNext())
		{
			String s = ll.next();
			System.out.println(s);
		}
		System.out.println("!!!!!!!!!!!!!!!!!");
		while(ll.hasPrevious())
		{
			String s = ll.previous();
			System.out.println(s);
		}
		
	}

}
