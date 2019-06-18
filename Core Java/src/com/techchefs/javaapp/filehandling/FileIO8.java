package com.techchefs.javaapp.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class FileIO8 {
	public static void main(String[] args) {
		FileOutputStream fout=null;
		ObjectOutputStream obj=null;
		Person p = new Person();
		p.setId(14);
		p.setName("Sita");
		try {
			fout = new FileOutputStream("Object.txt");
			obj =new ObjectOutputStream(fout);
			obj.writeObject(p);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(obj != null)
			{
				try {
					obj.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
