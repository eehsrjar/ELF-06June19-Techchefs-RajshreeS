package com.techchefs.javaapp.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemoA {

	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		hs.add(45);
		hs.add(12);
		hs.add(9);
		hs.add(0);
		hs.add(3);
		hs.add(12);
		hs.add(5);

		for (Object o : hs) {
			System.out.println(o);
		}

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
