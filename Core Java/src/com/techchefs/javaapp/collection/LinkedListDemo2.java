package com.techchefs.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<Character> cl = new LinkedList<Character>();
		cl.add('c');
		cl.add('A');
		cl.add('H');
		cl.add('N');
		cl.add('L');
		cl.add('W');
		
		for(int i=0;i<cl.size();i++)
		{
			Character c= cl.get(i);
			System.out.println(c);
		}
		System.out.println("**************");
		for(Character r : cl)
		{
			System.out.println(r);
		}
		System.out.println("**************");
		
		Iterator it = cl.iterator();
		while(it.hasNext())
		{
			Object o =it.next();
			System.out.println(o);
		}
		System.out.println("**************");
		ListIterator list=cl.listIterator();
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
