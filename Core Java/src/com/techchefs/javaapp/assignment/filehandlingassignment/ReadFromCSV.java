package com.techchefs.javaapp.assignment.filehandlingassignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class ReadFromCSV {
	public static void main(String[] args) {
		FileInputStream in=null;

		File f1=new File("srcfile.csv");
		

				try {
					in=new FileInputStream(f1);
					int i;
					while((i = in.read()) !=-1)
					{
						log.info(""+(char)i);
					}
					if(in!=null)
						in.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

}

}
