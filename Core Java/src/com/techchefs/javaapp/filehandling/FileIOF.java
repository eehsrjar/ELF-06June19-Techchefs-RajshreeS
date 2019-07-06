package com.techchefs.javaapp.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOF {
	public static void main(String[] args) {
		try {
			FileReader fin =new FileReader("msg.txt");
			int i ;
			while((i=fin.read()) != -1)
				System.out.print((char)i);
			fin.close();		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
