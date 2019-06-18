package com.techchefs.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO5 {

	public static void main(String[] args) {
		try {
			FileInputStream fin =new FileInputStream("mkl.txt");
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
