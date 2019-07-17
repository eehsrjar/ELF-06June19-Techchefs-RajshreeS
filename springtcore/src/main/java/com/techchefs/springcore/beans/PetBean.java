package com.techchefs.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.techchefs.springcore.interfaces.Animal;

public class PetBean {
	private String name;
	@Autowired
	private Animal animal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	

}
