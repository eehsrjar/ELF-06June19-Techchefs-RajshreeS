package com.techchefs.javaapp.assignment.patternassignment;

public class SquarePlusCroosPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j || i + j == 10 || i==1 || j==1 || i==9 || j==9 || i==5 || j==5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
