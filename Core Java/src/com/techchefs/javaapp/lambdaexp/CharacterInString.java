package com.techchefs.javaapp.lambdaexp;

import java.util.function.Function;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CharacterInString {
	private static final Logger loger = Logger.getLogger("Assignment");

	public static void main(String[] args) {
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.INFO);

		Function<String, Integer> f = n -> n.length();

		loger.log(Level.INFO, "" + f.apply("Hi Good Evening"));
	}

}
