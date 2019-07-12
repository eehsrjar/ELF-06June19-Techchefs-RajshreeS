package com.techchefs.javaapp.assignment.filehandlingassignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.java.Log;

@Log
public class StoreReadStudentObj {
	public static void main(String[] args) {
		Student student1 = new Student(2, "Ram", 56.9, "Male");
		Student student2 = new Student(6, "Maya", 67.9, "Female");
		Student student3 = new Student(3, "Jack", 86.9, "Male");
		Student student4 = new Student(8, "Neha", 76.9, "Female");
		Student student5 = new Student(1, "Nick", 46.9, "Male");

		try (FileOutputStream fout = new FileOutputStream("Student Objects.txt");
				ObjectOutputStream objStream = new ObjectOutputStream(fout)) {
			objStream.writeObject(student1);
			objStream.writeObject(student2);
			objStream.writeObject(student3);
			objStream.writeObject(student4);
			objStream.writeObject(student5);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fin = new FileInputStream("Student Objects.txt");
				ObjectInputStream objS = new ObjectInputStream(fin);) {
			List<Student> list = new ArrayList<>();
			Student st1 = (Student) objS.readObject();
			list.add(st1);
			Student st2 = (Student) objS.readObject();
			list.add(st2);
			Student st3 = (Student) objS.readObject();
			list.add(st3);
			Student st4 = (Student) objS.readObject();
			list.add(st4);
			Student st5 = (Student) objS.readObject();
			list.add(st5);

			for (Student student : list) {
				if (student.getPercentage() > 65.00) {
					log.info("Role Number :" + student.getRoleNumber());
					log.info("Name :" + student.getName());
					log.info("Percentage :" + student.getPercentage());
					log.info("Gender :" + student.getGender());
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
