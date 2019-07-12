package com.techchefs.javaapp.assignment.propertiesfileassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class ReadInfoFromPropertiesFile {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("info.properties");
			Properties p = new Properties();
			p.load(fin);
			log.info("Name : "+p.getProperty("Name"));
			log.info("Address : "+p.getProperty("Address"));
			log.info("Done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
