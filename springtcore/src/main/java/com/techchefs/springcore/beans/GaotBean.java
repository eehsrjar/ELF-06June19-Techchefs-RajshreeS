package com.techchefs.springcore.beans;

import com.techchefs.springcore.interfaces.Animal;

import lombok.extern.java.Log;
@Log
public class GaotBean implements Animal{
	public void eat() {
		log.info("Eating grass");
	}

	public void makeSound() {
		log.info("ow ow..........");
		
	}
}
