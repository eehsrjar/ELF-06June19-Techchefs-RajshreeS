package com.techchefs.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListDemoC {

	public static void main(String[] args) {
		ArrayList<Double> l = new ArrayList<Double>();
		l.add(45.1);
		l.add(5.0);
		l.add(40.1);

		for (Double d : l) {
			log.info("" + d);
		}
	}

}
