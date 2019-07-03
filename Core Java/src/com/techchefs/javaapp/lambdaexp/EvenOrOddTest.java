package com.techchefs.javaapp.lambdaexp;

import java.util.function.Predicate;
import java.util.logging.Logger;

public class EvenOrOddTest {
	private static final Logger log = Logger.getLogger("Assignment");
	public static void main(String[] args) {
		EvenOrOdd e = n -> n%2==0;
		log.info(""+e.test(6));
		Predicate<Integer> i = a -> a > 4;
		log.info(""+i.test(8));
	}

}
