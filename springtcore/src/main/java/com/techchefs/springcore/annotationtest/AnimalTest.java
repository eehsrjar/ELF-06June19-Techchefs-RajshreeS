package com.techchefs.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.DogBean;
import com.techchefs.springcore.beans.PetBean;
import com.techchefs.springcore.configuration.PetConfig;

public class AnimalTest {
	public static void main(String[] args) {
		//ApplicationContext context=new AnnotationConfigApplicationContext(PetConfig.class);
		ApplicationContext context=new ClassPathXmlApplicationContext("petConfig.xml");
		PetBean petBean=(PetBean) context.getBean("pet");
		//petBean.setAnimal(context.getBean("animal"));
		petBean.getAnimal().eat();
		petBean.getAnimal().makeSound();
	}
}
