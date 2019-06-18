package com.techchefs.javaapp.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	private static final Logger loger = Logger.getLogger("Amezon");

	void connectDB()
	{
		final boolean isConnected=false;
		if(isConnected)
			loger.log(Level.INFO,"Connected to DB");
		else
			loger.log(Level.SEVERE,"Failed to Connect to DB");
	}

	void store()
	{
		final boolean isStored=true;
		if(isStored)
			loger.log(Level.INFO,"Stored to DB");
		else
			loger.log(Level.SEVERE,"Failed to store to DB");
	}
}
