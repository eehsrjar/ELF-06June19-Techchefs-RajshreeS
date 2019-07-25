package com.techchefs.springcore.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

import lombok.extern.java.Log;
@Log
public class MyBeanPostProcessorTwo implements BeanPostProcessor,Ordered{
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.info("Inside PP-2 after initialization");
		return bean;
	}
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		log.info("Inside PP-2 before initialization");
		return bean;
	}
	public int getOrder() {
		
		return 0;
	}
}
