package com.techchefs.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.MessageBean;

import lombok.extern.java.Log;
@Log
public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		MessageBean bean=(MessageBean) applicationContext.getBean("msgBean");
		log.info(""+bean.getMessage());
	}
}
