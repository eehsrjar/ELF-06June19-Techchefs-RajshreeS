package com.techchefs.javaapp.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListWithListIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(14);
		list.add(null);
		list.add(5.7);
		list.add('A');
		list.add("training");
		list.add('A');
		list.add(null);
		
		ListIterator lt = list.listIterator();
		System.out.println("############Forword##############");
		while(lt.hasNext())
		{
			Object o = lt.next();
			System.out.println(o);
		}
		System.out.println("############BAckword##############");
		while(lt.hasPrevious())
		{
			Object o = lt.previous();
			System.out.println(o);
		}
	}
}
