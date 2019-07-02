package com.techchefs.javaapp.assignment.patternassignment;

public class PatternHalfDiamond {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i >= 2 && j > 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");

				}
			}
			System.out.print("*");
			System.out.println();

		}

		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i >= 2 && j <= i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			for (int l = 3; l >= i - 1; l--) {
				System.out.print(" ");
			}
			System.out.print("*");

			System.out.println();

		}
	}
}
