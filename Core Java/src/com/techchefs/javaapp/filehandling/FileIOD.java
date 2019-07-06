package com.techchefs.javaapp.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOD {

	public static void main(String[] args) {
		String str = "Hello jkdfh";
		char c[] = str.toCharArray();

		try {
			FileWriter fw = new FileWriter("mkl.txt",true);
			fw.write(c);
			fw.flush();
			System.out.println("Written into file");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
