package com.techchefs.springcore.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import lombok.extern.java.Log;
@Log
public class MyBeanPostProcessor implements BeanPostProcessor{
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.info("Inside PP after initialization");
		return bean;
	}
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		log.info("Inside PP before initialization");
		return bean;
	}
}
