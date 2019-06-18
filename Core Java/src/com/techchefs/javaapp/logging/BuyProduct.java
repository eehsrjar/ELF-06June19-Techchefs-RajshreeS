package com.techchefs.javaapp.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	private static final Logger loger = Logger.getLogger("LoggerDemo"); 
	
	void buy(){
		loger.log(Level.SEVERE, "SEVERE Message in buyProduct");
	}

}
