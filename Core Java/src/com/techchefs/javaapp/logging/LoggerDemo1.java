package com.techchefs.javaapp.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerDemo1 {
	private static final Logger loger = Logger.getLogger("LoggerDemo");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.ALL);
		loger.addHandler(ch);
		
		loger.log(Level.SEVERE, "SEVERE Message");
		loger.log(Level.WARNING, "WARNING Message");
		loger.log(Level.INFO, "INFO Message");
		loger.log(Level.CONFIG, "CONFIG Message");
		loger.log(Level.FINE, "FINE Message");
		loger.log(Level.FINER, "FINER Message");
		loger.log(Level.FINEST, "FINEST Message");
	}

}
