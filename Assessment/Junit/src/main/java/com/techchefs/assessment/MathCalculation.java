package com.techchefs.assessment;

public class MathCalculation {

	public double calculateSimpleInterest(int p, double r, int y) {
		return (p * r * y) / 100;

	}

	public double calculatePer(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}

	public int calculateFact(int n) {
		if (n == 0) {
			return 1;
		} else {
			int f = 1;
			for (int i = n; i > 0; i--) {
				f = f * i;
			}
			return f;
		}
	}
}
