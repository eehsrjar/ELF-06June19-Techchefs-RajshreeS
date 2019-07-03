package com.techchefs.javaapp.lambdaexp;

import java.util.function.Predicate;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckLenWithPredicate {
	private static final Logger loger = Logger.getLogger("Assignment");
	public static void main(String[] args) {
		
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.ALL);
		loger.addHandler(ch);
		
		Predicate<String> s = a -> a.length() >=5;
		loger.log(Level.INFO,""+s.test("Hi How arer you?"));
	}

}
