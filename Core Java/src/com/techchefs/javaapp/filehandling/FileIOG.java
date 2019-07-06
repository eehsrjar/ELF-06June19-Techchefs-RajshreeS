package com.techchefs.javaapp.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileIOG {

	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("abc.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
