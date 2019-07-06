package com.techchefs.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

public class FileIOA {

	public static void main(String[] args) {
		File f =new File("D:/abc.txt");
		try {
			boolean res=f.createNewFile();

			System.out.println("Result is "+res);

			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
