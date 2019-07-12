package com.techchefs.javaapp.assignment.filehandlingassignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppendContent {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;

		File f1 = new File("srcfile.txt");
		File f2 = new File("destfile.txt");

		try {
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);
			byte[] b = new byte[1024];
			int length;
			while ((length = in.read(b)) > 0) {
				out.write(b, 0, length);
			}
			if (in != null)
				in.close();
			if (out != null)
				out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
