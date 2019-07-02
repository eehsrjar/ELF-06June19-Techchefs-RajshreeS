package com.techchefs.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class VectorDemoB {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(7);
		v.add(6);
		v.add(89);

		for (Integer i : v) {
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
