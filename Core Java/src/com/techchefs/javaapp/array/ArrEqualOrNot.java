package com.techchefs.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class ArrEqualOrNot {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 9, 9 };
		int[] arr2 = { 2, 4, 7, 9 };
		boolean flag = false;
//		if(arr1.length == arr2.length)
//		{
//			
//			for(int i=0;i<arr1.length;i++)
//			{
//				for(int j=0;j<arr2.length;j++)
//				{
//					if(arr1[i] == arr2[j])
//					{
//						flag = true;
//					}
//				}
//			}
//		}
//		else
//		{
//			System.out.println("Arrays are not equal");
//		}
		flag = Arrays.equals(arr1, arr2);
		if (flag) {
			log.info("Arrays are equal");
		} else {
			log.info("Arrays are not equal");
		}
	}

}
