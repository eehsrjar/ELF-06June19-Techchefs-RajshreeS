package com.techchefs.javaaapp.assignment.thirdassignment;

import lombok.extern.java.Log;

@Log
public class CarWithFuelTest {

	public static void main(String[] args) {
		CarWithFuel c = new CarWithFuel(4.7);
		log.info("Car with initial fuel :" + c.fuel);
	}

}
