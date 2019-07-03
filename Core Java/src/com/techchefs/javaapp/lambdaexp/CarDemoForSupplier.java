package com.techchefs.javaapp.lambdaexp;

import java.util.function.Supplier;

public class CarDemoForSupplier {

	public static void main(String[] args) {
		Supplier< Car> s = () -> new Car(3.4);
		Car c = s.get();
		System.out.println(c.fuelCapacity);
	}

}
