package com.techchefs.javaapp.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerDemo2 {
	private static final Logger loger = Logger.getLogger("LoggerDemo2");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		FileHandler fh;
		try {
			fh = new FileHandler("LoggerData.log");
			fh.setLevel(Level.WARNING);
			loger.addHandler(fh);
			loger.log(Level.INFO,"XML format with overridding previous messages");
			loger.log(Level.SEVERE, "SEVERE Message");
			loger.log(Level.WARNING, "WARNING Message");
			loger.log(Level.INFO, "INFO Message");
			loger.log(Level.CONFIG, "CONFIG Message");
			loger.log(Level.FINE, "FINE Message");
			loger.log(Level.FINER, "FINER Message");
			loger.log(Level.FINEST, "FINEST Message");
		} catch (SecurityException | IOException e) {
			loger.log(Level.INFO,"context", e);
		}

	}
}
