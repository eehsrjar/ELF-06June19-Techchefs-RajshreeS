package com.techchefs.javaapp.assignment.filehandlingassignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ReadAndWriteData {
	public static void main(String[] args) throws IOException {
		write();
		read();
	}
	public static void write() {
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
	
	public static void read() throws IOException {
		FileInputStream fin=null;
		try {
			fin = new FileInputStream("xyz.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int i ;
		while((i=fin.read()) != -1)
			System.out.print((char)i);
		fin.close();
	}
}
