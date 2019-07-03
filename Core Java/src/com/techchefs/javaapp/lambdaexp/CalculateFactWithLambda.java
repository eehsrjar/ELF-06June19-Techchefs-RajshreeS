package com.techchefs.javaapp.lambdaexp;

import java.util.logging.Logger;

public class CalculateFactWithLambda {
	private static final Logger log = Logger.getLogger("Assignment");
	public static void main(String[] args) {
		Factorial f = a -> {
			int i = 1;
			for (int j = 1; j <= a; j++) {
				i = i * j;
			}
			return i;
		};

		int res = f.fact(5);
		log.info(""+ res);
	}

}
