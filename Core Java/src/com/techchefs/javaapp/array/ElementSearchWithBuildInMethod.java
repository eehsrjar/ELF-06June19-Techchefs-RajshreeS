package com.techchefs.javaapp.array;

import java.util.Arrays;

public class ElementSearchWithBuildInMethod {

	public static void main(String[] args) {
		int arr[]= {3,7,1,9,23};
		int key = 3;
		Arrays.sort(arr);
		
		int index=Arrays.binarySearch(arr, key);
		if(index <0)
		{
			System.out.println("Element not present in array");
		}
		else
		{
			System.out.println("Element present in array");
		}
	}

}
