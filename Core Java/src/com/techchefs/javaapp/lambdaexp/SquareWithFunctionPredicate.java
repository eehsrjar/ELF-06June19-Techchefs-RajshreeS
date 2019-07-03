package com.techchefs.javaapp.lambdaexp;

import java.util.function.Function;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SquareWithFunctionPredicate {
	private static final Logger loger = Logger.getLogger("Assignment");
	public static void main(String[] args) {
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.ALL);
		loger.addHandler(ch);
		
		Function<Double,Double> f =r -> 3.14 * r*r;
		double x = f.apply( 4.0);
		loger.log(Level.INFO,""+x);
	}

}
