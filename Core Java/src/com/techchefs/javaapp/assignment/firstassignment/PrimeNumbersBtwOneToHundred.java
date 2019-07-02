package com.techchefs.javaapp.assignment.firstassignment;

import lombok.extern.java.Log;

@Log
public class PrimeNumbersBtwOneToHundred {

	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			if (prime(i) != 0) {
				log.info("" + i);
			}
		}
	}

	public static int prime(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0)
			return n;
		else
			return 0;
	}

}
