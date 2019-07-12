package com.techchefs.javaapp.assignment.propertiesfileassignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class WriteToPropertiesFile {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("info.properties");
			Properties p = new Properties();
			p.setProperty("Name", "Rajshree");
			p.setProperty("Address", "Jalahalli");
			p.store(fout, "Personal Details");
			log.info("Done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
