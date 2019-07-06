package com.techchefs.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOC {

	public static void main(String[] args) {
		String str ="Hi, Good evening";
		byte[] b=str.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("xyz.txt",true);
			fout.write(b);
			System.out.println("Written into file xyz");
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
