package com.techchefs.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArrayCopyB {

	public static void main(String[] args) {
		int[] a = { 5, 6, 2, 1, 4 };
		int[] b = { 30, 40, 50, 60, 70, 80 };

		int givenIndex = 1;

		int count = 0;
		for (int i = givenIndex; i < b.length && count < 2; i++, count++) {
			b[i] = a[givenIndex];
			givenIndex++;

		}
		for (int i = 0; i < b.length; i++) {
			log.info("" + b[i]);
		}
		log.info("**************");
		System.arraycopy(a, 1, b, 2, 2);
		for (int i = 0; i < b.length; i++) {
			log.info("" + b[i]);
		}
	}

}
