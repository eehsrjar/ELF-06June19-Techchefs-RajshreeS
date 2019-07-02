package com.techchefs.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayE {

	public static void main(String[] args) {
		ArrayList<Double> l = new ArrayList<>();
		l.add(9.2);
		l.add(1.6);
		l.add(6.9);
		l.add(2.4);
		l.add(3.6);

		ArrayList<Double> l1 = new ArrayList<>();
		l1.add(19.2);
		l1.add(1.56);

		log.info("Before ----->" + l);

		l.addAll(l1);

		log.info("After ----->" + l);
	}

}
