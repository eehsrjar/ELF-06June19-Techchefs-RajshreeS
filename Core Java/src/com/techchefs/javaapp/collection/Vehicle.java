package com.techchefs.javaapp.collection;

import lombok.extern.java.Log;

@Log
public class Vehicle {
	int a;

	void runOnPetrol() {
		log.info("Petrol");
	}

	void runOnDiesel() {
		log.info("Diesel");
	}
}
