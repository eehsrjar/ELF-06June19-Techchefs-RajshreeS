package com.techchefs.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListA {

	public static void main(String[] args) {
		LinkedList ll =new LinkedList();
		ll.add(14);
		ll.add(null);
		ll.add(5.7);
		ll.add('A');
		ll.add("training");
		ll.add('A');
		ll.add(null);
		
		for(Object o :ll)
		{
			System.out.println(o);
		}
		System.out.println("**************");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			Object o =it.next();
			System.out.println(o);
		}
		System.out.println("**************");
		ListIterator list=ll.listIterator();
		while(list.hasNext())
		{
			Object o =list.next();
			System.out.println(o);
		}
		System.out.println("**************");
		while(list.hasPrevious())
		{
			Object o =list.previous();
			System.out.println(o);
		}
	
	}

}
