package com.techchefs.javaapp.assignment.firstassignment;

import lombok.extern.java.Log;

@Log
public class EvenNumbersDivByFive {

	public static void main(String[] args) {
		log.info("Even numbers between 50 to 100 divisible by 5");
		for (int i = 50; i <= 100; i++) {
			if (i % 2 == 0 && i % 5 == 0) {
				log.info("" + i);
			}
		}
	}

}
