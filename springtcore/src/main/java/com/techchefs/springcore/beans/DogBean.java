package com.techchefs.springcore.beans;

import com.techchefs.springcore.interfaces.Animal;

import lombok.extern.java.Log;
@Log
public class DogBean implements Animal{

	public void eat() {
		log.info("Eating Pedigree");
	}

	public void makeSound() {
		log.info("Bow bow..........");
		
	}

}
