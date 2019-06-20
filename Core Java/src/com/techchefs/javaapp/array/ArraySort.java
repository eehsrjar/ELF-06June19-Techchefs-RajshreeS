package com.techchefs.javaapp.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

public class ArraySort {
	public static final Logger loger = Logger.getLogger("logger");
	public static void main(String[] args) {
		int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
		String[] arr = {"sf","hj","ui"};
//		   int temp;
//		   for (int i = 1; i < array.length; i++) {
//		    for (int j = i; j > 0; j--) {
//		     if (array[j] < array [j - 1]) {
//		      temp = array[j];
//		      array[j] = array[j - 1];
//		      array[j - 1] = temp;
//		     }
//		    }
//		   }
			Arrays.sort(array);
			Arrays.sort(arr,Collections.reverseOrder());//reverse order
		   for (int i = 0; i < array.length; i++) {
		     System.out.println(array[i]);
		   }
		   for (int i = 0; i < arr.length; i++) {
			     System.out.println(arr[i]);
			   }
	}

}
