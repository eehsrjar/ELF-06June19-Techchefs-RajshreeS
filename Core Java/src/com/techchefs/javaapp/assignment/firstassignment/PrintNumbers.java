package com.techchefs.javaapp.assignment.firstassignment;

import lombok.extern.java.Log;

@Log
public class PrintNumbers {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			log.info("" + i);
		}
	}
}
