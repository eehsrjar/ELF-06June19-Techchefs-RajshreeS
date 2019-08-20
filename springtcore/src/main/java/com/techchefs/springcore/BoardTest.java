package com.techchefs.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.Board;
import com.techchefs.springcore.beans.MessageBean;

import lombok.extern.java.Log;
@Log
public class BoardTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("boardBean.xml");
		Board bean=(Board) applicationContext.getBean("boardBean");
		log.info(""+bean.getType());
	}
}
