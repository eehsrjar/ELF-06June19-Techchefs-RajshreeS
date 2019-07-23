package com.techchefs.springcoreassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcoreassignment.beans.Dell;
import com.techchefs.springcoreassignment.beans.PenDrive;
import com.techchefs.springcoreassignment.config.StorageConfig;
import com.techchefs.springcoreassignment.interfaces.StorageDevice;

public class DeviceTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Dell dell=context.getBean(Dell.class);
		dell.showSpecification();
		StorageDevice device=dell.getDevice();
		device.format();
	}
}
