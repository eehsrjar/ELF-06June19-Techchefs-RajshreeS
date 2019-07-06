package com.techchefs.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class TryResourcFileHandlingDemo {

	public static void main(String[] args) {
		String str = "Hi, Good evening";
		byte[] b = str.getBytes();
		try(FileOutputStream fout = new FileOutputStream("xyz.txt", true)) {			
			fout.write(b);
			log.info("Written into file xyz");
		} catch (FileNotFoundException e) {
			log.info(""+e.getMessage());
		} catch (IOException e) {
			log.info(""+e.getMessage());
		}

	}

}
