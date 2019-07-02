package com.techchefs.javaaapp.assignment.thirdassignment;

public class DriverTest {

	public static void main(String[] args) {
		Benz b = new Benz();
		Audi a = new Audi();
		Driver d = new Driver();
		d.receive(b);
		d.receive(a);
	}

}
