package com.techchefs.javaapp.classbean;

import java.util.logging.Logger;


public class MyArrayTest {
	private static final Logger log = Logger.getLogger("Array");

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		MyArray m = new MyArray();
		int n = 10;

		for (int i = 0; i < n; i++) {
			m.add("value " + i);
		}
		for (int i = 0; i < n; i++) {
			log.info("Elements are " + m.get(i));
		}

		m.remove(3);

		for (int i = 0; i < n; i++) {
			log.info("Elements are " + m.get(i));
		}
		m.add(4);
		long endTime = System.currentTimeMillis();
		log.info("method execution time " + (endTime - startTime) + "ms");

	}

}
