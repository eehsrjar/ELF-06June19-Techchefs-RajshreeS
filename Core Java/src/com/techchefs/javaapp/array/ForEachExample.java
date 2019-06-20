package com.techchefs.javaapp.array;

public class ForEachExample {

	public static void main(String[] args) {
		int arr[]= {3,7,1,9,23};
		double arr2[] = {2.3,4.7,4.9,0.2,20.7};
		String[] arr3 = {"sf","hj","ui"};
		for(int e : arr)
		{
			System.out.println(e);
		}
		for(double e : arr2)
		{
			System.out.println(e);
		}
		for(String e : arr3)
		{
			System.out.println(e);
		}
		
	}

}
