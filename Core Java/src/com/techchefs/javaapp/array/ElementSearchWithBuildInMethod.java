package com.techchefs.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class ElementSearchWithBuildInMethod {

	public static void main(String[] args) {
		int arr[] = { 3, 7, 1, 9, 23 };
		int key = 3;
		Arrays.sort(arr);

		int index = Arrays.binarySearch(arr, key);
		if (index < 0) {
			log.info("Element not present in array");
		} else {
			log.info("Element present in array");
		}
	}

}
