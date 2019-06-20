package com.techchefs.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(2);
		v.add('e');
		v.add(2.5);
		v.add("vhy");
		
		for(Object o : v)
		{
			System.out.println(o);
		}
		
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			Object o =it.next();
			System.out.println(o);
		}
		System.out.println("**************");
		ListIterator list=v.listIterator();
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
		System.out.println("**************");
		Enumeration e =v.elements();
		while(e.hasMoreElements())
		{
			Object o = e.nextElement();
			System.out.println(o);
		}
	}

}
