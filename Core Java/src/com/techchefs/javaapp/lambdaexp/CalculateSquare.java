package com.techchefs.javaapp.lambdaexp;

import java.util.logging.Logger;

interface Square {
	int square(int a);
}

public class CalculateSquare {
	private static final Logger log = Logger.getLogger("Assignment");
	public static void main(String[] args) {
		Square s = a -> a * a;
		int res = s.square(5);
		log.info(""+ res);
	}

}
