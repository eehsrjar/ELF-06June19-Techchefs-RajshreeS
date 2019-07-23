package com.techchefs.springcoreassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.techchefs.springcoreassignment.beans.Dell;
import com.techchefs.springcoreassignment.beans.HP;

@Component
public class StorageConfig {
	@Bean
	public Dell getDellBean() {
		Dell dell=new Dell();
		dell.setBrand("Dell");
		dell.setColor("White");
		dell.setCost(20000.00);
		dell.setOs("Windows");
		dell.setRam("16GB");
		dell.setWeight("2kg");
		return dell;
	}
	@Bean
	public HP getHPBean() {
		HP hp=new HP();
		hp.setBrand("HP");
		hp.setColor("Black");
		hp.setCost(30000.00);
		hp.setOs("Windows");
		hp.setRam("8GB");
		hp.setWeight("3kg");
		return hp;
	}
}
