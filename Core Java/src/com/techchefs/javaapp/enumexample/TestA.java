package com.techchefs.javaapp.enumexample;

import lombok.extern.java.Log;

@Log
public class TestA {
	public static void main(String[] args) {
		log.info(""+Gender.MALE);
		log.info(""+Gender.FEMALE);
		log.info(""+Gender.OTHER);
		
		log.info(""+Gender.MALE.ordinal());
		
		Gender t =Gender.FEMALE;
		
		switch(t) {
		case FEMALE : log.info("Enum Female");
		break;
		case MALE : log.info("Enum Male");
		break;
		case OTHER : log.info("Enum Ohter");
		break;
		
		}
	}
}
