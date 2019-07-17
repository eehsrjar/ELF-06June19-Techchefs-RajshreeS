package com.techchefs.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techchefs.springcore.beans.DogBean;
import com.techchefs.springcore.beans.PetBean;
import com.techchefs.springcore.interfaces.Animal;

@Configuration
public class PetConfig {
	@Bean
	public PetBean getPetAnimal() {
		return new PetBean();
	}
	@Bean
	
	public Animal getAnimal() {
		return new DogBean();
	}
	
}
