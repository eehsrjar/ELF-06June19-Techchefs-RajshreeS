package com.techchefs.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArrayCopy {

	public static void main(String[] args) {
		int[] a = { 5, 6, 2, 1, 4 };
		int[] b = { 30, 40, 50, 60, 70, 80 };
		for (int i = 0; i < b.length; i++) {
			log.info(""+b[i]);
		}
		int j = 0;
		for (int i = 2; i < b.length; i++) {
			b[i] = a[j++];
		}

		/*
		 * int givenfromSrcIndex=2; int givenToDestIndex=2; int
		 * numberOfelementsToCopy=2; int count =0; for(int i=givenToDestIndex;i<b.length
		 * && count<numberOfelementsToCopy;i++) { b[i]=a[givenfromSrcIndex];
		 * givenToDestIndex++; count++; }
		 */

		for (int i = 0; i < b.length; i++) {
			log.info(""+b[i]);
		}

	}

}
