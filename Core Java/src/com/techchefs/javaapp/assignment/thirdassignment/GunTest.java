package com.techchefs.javaaapp.assignment.thirdassignment;

import lombok.extern.java.Log;

@Log
public class GunTest {

	public static void main(String[] args) {
		Gun a = new Gun(100);
		log.info("Gun with " + a.bullets + " loaded bullets");
	}

}
