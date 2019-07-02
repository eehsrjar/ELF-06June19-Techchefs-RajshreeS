package com.techchefs.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayA {

	public static void main(String[] args) {
		ArrayList<Double> l = new ArrayList<>();
		l.add(9.2);
		l.add(1.6);
		l.add(6.9);
		l.add(2.4);
		l.add(3.6);

		log.info("Before ----->" + l);

		l.add(22.34);

		log.info("After ----->" + l);
	}

}
