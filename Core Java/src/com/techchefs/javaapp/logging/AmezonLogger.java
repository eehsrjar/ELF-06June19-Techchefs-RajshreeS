package com.techchefs.javaapp.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class AmezonLogger {
	private static final Logger loger = Logger.getLogger("Amezon");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();

		try {
			FileHandler fh =new FileHandler("AmezonData.log",true);
			fh.setLevel(Level.CONFIG);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);

			Register reg = new Register();
			reg.connectDB();
			reg.store();
			loger.log(Level.INFO, "Done");
		}catch(SecurityException | IOException e) {
			loger.log(Level.INFO,"context", e);

		}
	}

}
