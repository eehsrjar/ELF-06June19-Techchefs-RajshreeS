package com.techchefs.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArrayElementSearch {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 8, 34, 68 };
		int eleToFind = 80;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == eleToFind) {
				flag = true;
			}
		}
		if (flag) {
			log.info("Element is present");
		} else {
			log.info("Element not present");
		}
	}

}
