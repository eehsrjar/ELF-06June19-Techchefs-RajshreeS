package com.techchefs.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class FileIO9 {

	public static void main(String[] args) {
		FileInputStream fin =null;
		ObjectInputStream obj =null;
		try {
			fin = new FileInputStream("object.txt");
			obj = new ObjectInputStream(fin);
			Person p = (Person)obj.readObject();
			System.out.println(p.getId());
			System.out.println(p.getName());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(obj != null) {
				try {
					obj.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}
	}
}
