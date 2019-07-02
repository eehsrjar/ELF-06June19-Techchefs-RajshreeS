package com.techchefs.javaaapp.assignment.thirdassignment;

import lombok.extern.java.Log;

@Log
public class Audi implements Car {
	@Override
	public void drive() {
		log.info("Driving Audi car");
	}

}
