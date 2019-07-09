package com.techchefs.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateProgramForAWS {
	public static void main(String[] args) {
		//1.Load the config file
		Configuration configuration=new Configuration();
		configuration.configure("com/techchefs/hibernateapp/awsrds/hibernate.aws.cfg.xml");
		configuration.addAnnotatedClass(EmployeeInfoNew.class);
		
		//2.Build the session factory
		SessionFactory factory=configuration.buildSessionFactory();
		
		//3.open session
		Session session=factory.openSession();
		
		//4.Interact with DB via session
		EmployeeInfoNew bean=session.get(EmployeeInfoNew.class, 1000);
		log.info("Employee Details: "+bean.toString());
		
		//5.Close session
		session.close();
				
	}
}
