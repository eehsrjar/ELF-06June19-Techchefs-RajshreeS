package com.techchefs.javaapp.referenceoperator;

public class RoomTest {
	static void open() {
		System.out.println("&&&&& Open Method &&&&&&&&&");
		System.out.println("Method in RoomTest class");
	}

	public static void main(String[] args) {
		Room r = RoomTest :: open;
		r.move();
	}

}
