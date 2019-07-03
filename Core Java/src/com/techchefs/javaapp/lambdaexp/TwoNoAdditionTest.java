package com.techchefs.javaapp.lambdaexp;

import java.util.logging.Logger;

public class TwoNoAdditionTest {
	private static final Logger log = Logger.getLogger("Assignment");
	public static void main(String[] args) {
		TwoNoAddition t = (a,b) -> {
			return (a+b);
		};
		int res = t.add(13, 6);
		log.info(""+res);
	}

}
