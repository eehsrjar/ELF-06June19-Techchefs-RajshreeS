package com.techchefs.hibernateassessment.test;

import com.techchefs.hibernateassessment.dao.HibernateDAOImpl;
import com.techchefs.hibernateassessment.dto.CustomerBean;

import lombok.extern.java.Log;
@Log
public class CustomerCRUDTest {
	public static void main(String[] args) {
		HibernateDAOImpl dao=new HibernateDAOImpl();
		//Insert customer details in customer Table
		CustomerBean bean= new CustomerBean();
		bean.setId(100);
		bean.setFirstName("Jaya");
		bean.setLastName("h");
		bean.setContactNumber(987654321l);
		bean.setCity("Bangalore");
		bean.setAddress("First cross");
		bean.setState("Kar");
		bean.setCountry("India");
		
		  if(dao.saveOrUpdate(bean)) { 
			  log.info("Customer Data Added Successfully");
		  }else {
			  log.info("Something Is wrong"); 
			  }
		 
		
		//Update Operation
		CustomerBean bean1= new CustomerBean();
		bean1.setId(101);		
		bean1.setLastName("K H");
		
		  if(dao.saveOrUpdate(bean1)) { 
			  log.info("Customer Data Updated Successfully");
		  }else {
			  log.info("Something Is wrong"); 
			  }
		 
		
		//Read Operation
		CustomerBean bean2=dao.getCustomerInfo(100);
		if(bean2 !=null) {
			log.info("Id :"+bean2.getId());
			log.info("FirstName : "+bean2.getFirstName());
			log.info("Lastname : "+bean2.getLastName());
			log.info("Contact : "+bean2.getContactNumber());
			log.info("City : "+bean2.getCity());
			log.info("Address : "+bean2.getAddress());
			log.info("State : "+bean2.getState());
			log.info("Country : "+bean2.getCountry());
		}
		
		//Delete Operation
		if(dao.deleteCustomerInfo(101)) {
			log.info("Customer Data deleted Successfully");
		}else {
			log.info("Something Is wrong");
		}
	}
}
