package com.techchefs.javaapp.assignment.assignment1;

public class PrimeNumbersBtw1To100 {

	public static void main(String[] args) {

	}
	public static int prime(int n) {
		int count = 0;
		for(int i = 2;i<=n/2;i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 0)		
			return n;
		else
			return 0;
	}

}
