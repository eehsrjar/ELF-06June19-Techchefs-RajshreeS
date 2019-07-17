package com.techchefs.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.techchefs.springcore.beans.MessageBean;
import com.techchefs.springcore.configuration.MessageConfig;

import lombok.extern.java.Log;
@Log
public class MesageBeanWithAnnotation {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);

		// ((ConfigurableApplicationContext)context).registerShutdownHook();
		MessageBean bean = context.getBean(MessageBean.class);
		log.info("" + bean.getMessage());

		((AbstractApplicationContext) context).close();
	}
}
