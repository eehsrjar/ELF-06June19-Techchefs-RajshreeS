package com.techchefs.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>();
		v.add(1);
		v.add(7);
		v.add(6);
		v.add(89);
		
		for(Integer i : v)
		{
			System.out.println(i);
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
		Enumeration<Integer> e =v.elements();
		while(e.hasMoreElements())
		{
			Integer o = e.nextElement();
			System.out.println(o);
		}
	}

}
