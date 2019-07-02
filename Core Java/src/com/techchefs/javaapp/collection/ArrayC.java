package com.techchefs.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayC {

	public static void main(String[] args) {
		ArrayList<Double> l = new ArrayList<Double>();
		l.add(9.2);
		l.add(1.6);
		l.add(6.9);
		l.add(2.4);
		l.add(3.6);

		log.info("Before ----->" + l);

		Double d = l.remove(3);
		log.info("Removed Object is " + d);

		log.info("After ----->" + l);
	}

}
