package com.techchefs.javaapp.filehandling;

import java.io.File;

public class FileIO2 {
	public static void main(String[] args) {
		File f =new File("programFile/java/abc");
		boolean res= f.mkdirs();
		System.out.println("Result is "+res);
	}
}
