package com.techchefs.javaapp.assignment.firstassignment;

import lombok.extern.java.Log;

@Log
public class OddNumbersDivBySeven {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 && i % 7 == 0) {
				log.info("" + i);
			}
		}
	}
}
