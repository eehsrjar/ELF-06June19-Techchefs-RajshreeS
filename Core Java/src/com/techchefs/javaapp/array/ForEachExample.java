package com.techchefs.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ForEachExample {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 1, 9, 23 };
		double[] arr2 = { 2.3, 4.7, 4.9, 0.2, 20.7 };
		String[] arr3 = { "sf", "hj", "ui" };
		for (int e : arr) {
			log.info("" + e);
		}
		for (double e : arr2) {
			log.info("" + e);
		}
		for (String e : arr3) {
			log.info("" + e);
		}

	}

}
