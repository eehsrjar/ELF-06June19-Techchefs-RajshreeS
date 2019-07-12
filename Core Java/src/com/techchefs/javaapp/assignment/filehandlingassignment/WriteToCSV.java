package com.techchefs.javaapp.assignment.filehandlingassignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToCSV {
	public static void main(String[] args) {

		FileOutputStream fout=null;
	ObjectOutputStream obj=null;
		try {
			Employee e=new Employee("RAjshree", 20,  20000,2,"Developer");
			fout =new FileOutputStream("person.csv");
			obj=new ObjectOutputStream(fout);
			obj.writeObject(e);	
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
		
				try {
					if(fout!=null)
					fout.close();
					if(obj!=null)
						obj.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}


}
