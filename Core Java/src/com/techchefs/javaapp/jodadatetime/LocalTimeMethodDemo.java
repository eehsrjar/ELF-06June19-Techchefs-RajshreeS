package com.techchefs.javaapp.jodadatetime;

import java.time.LocalTime;

import lombok.extern.java.Log;

@Log
public class LocalTimeMethodDemo {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		log.info(""+t);
	}

}
