package com.techchefs.javaapp.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class FileHandlingReadWrite {

	public static void main(String[] args) {
		try {
			FileUtils.writeStringToFile(new File("D://Rajshree//newFile.txt"), "New file data", Charset.defaultCharset());
			System.out.println("Created file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
