package com.techchefs.javaapp.assignment.firstassignment;

import lombok.extern.java.Log;

@Log
public class PrimeNumber {

	public static void main(String[] args) {
		int number = 15;
		int count = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			log.info("Given number is prime " + number);
		}
	}

}
