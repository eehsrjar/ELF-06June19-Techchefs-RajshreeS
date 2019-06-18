package com.techchefs.javaapp.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerDemo3 {
	private static final Logger loger = Logger.getLogger("LoggerDemo"); 
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		try {
			FileHandler fh = new FileHandler("LoggerData1",true);// to append
			fh.setLevel(Level.WARNING);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);

			loger.log(Level.INFO,"Simple format without overridding/appending previous messages");
			loger.log(Level.SEVERE, "SEVERE Message");
			loger.log(Level.WARNING, "WARNING Message");
			loger.log(Level.INFO, "INFO Message");
			loger.log(Level.CONFIG, "CONFIG Message");
			loger.log(Level.FINE, "FINE Message");
			loger.log(Level.FINER, "FINER Message");
			loger.log(Level.FINEST, "FINEST Message");

			BuyProduct b = new BuyProduct();
			b.buy();

		}catch(SecurityException | IOException e)
		{
			loger.log(Level.INFO,"context", e);
		}
	}

}
