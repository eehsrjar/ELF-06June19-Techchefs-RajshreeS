package com.techchefs.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class VectorDemoA {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(2);
		v.add('e');
		v.add(2.5);
		v.add("vhy");

		for (Object i : v) {
			log.info("" + i);
		}

		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			log.info("" + o);
		}
		log.info("**************");
		ListIterator list = v.listIterator();
		while (list.hasNext()) {
			Object o = list.next();
			log.info("" + o);
		}
		log.info("**************");
		while (list.hasPrevious()) {
			Object o = list.previous();
			log.info("" + o);
		}
		log.info("**************");
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer o = e.nextElement();
			log.info("" + o);
		}
	}

}
