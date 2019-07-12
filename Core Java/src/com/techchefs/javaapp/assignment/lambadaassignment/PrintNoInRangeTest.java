package com.techchefs.javaapp.assignment.lambadaassignment;

import java.util.logging.Logger;

public class PrintNoInRangeTest {
	private static final Logger log = Logger.getLogger("Assignment");

	public static void main(String[] args) {
		PrintNoInRange p = (a, b) -> {
			for (int i = a; i <= b; i++) {
				log.info("" + i);
			}
		};
		p.print(3, 10);
	}

}
