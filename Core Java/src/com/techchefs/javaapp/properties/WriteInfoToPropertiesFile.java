package com.techchefs.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class WriteInfoToPropertiesFile {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("Sample.properties");
			Properties p = new Properties();
			p.setProperty("CompanyName", "Techchefs");
			p.setProperty("Address", "Jayanagar");
			p.store(fout, "Details");
			log.info("Done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
