package com.techchefs.javaapp.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;

public class FileHandlingExample {
	private static final Logger loger = Logger.getLogger("LoggerDemo");
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.ALL);
		loger.addHandler(ch);
		try {
			FileUtils.writeStringToFile(
					new File("myfirstFile2.txt"),
					"Hi My second file",
					Charset.defaultCharset());
			loger.log(Level.INFO,"Created file");
		} catch (IOException e) {
			loger.log(Level.INFO,"context", e);
		}
	}

}
