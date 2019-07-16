package com.techchefs.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.Employee;

import lombok.extern.java.Log;
@Log
public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=(Employee) context.getBean("emp");
		Scanner sc=new Scanner(System.in);
		log.info("Enter Id:");
		int id=sc.nextInt();
		emp.setId(id);
		sc.nextLine();
		log.info("Enter name:");
		String name=sc.next();
		emp.setName(name);
		
		
		Employee emp2=(Employee) context.getBean("emp");
		log.info("Enter Id:");
		int id1=sc.nextInt();
		emp2.setId(id1);
		sc.nextLine();
		log.info("Enter name:");
		String name1=sc.next();
		emp2.setName(name1);
		log.info("Id: "+emp.getId());
		log.info("Name: "+emp.getName());
		log.info("Id: "+emp2.getId());
		log.info("Name: "+emp2.getName());
	}
}
