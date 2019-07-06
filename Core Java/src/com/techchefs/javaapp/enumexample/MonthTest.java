package com.techchefs.javaapp.enumexample;

import lombok.extern.java.Log;

@Log
public class MonthTest {

	public static void main(String[] args) {
		Month m = Month.FEB;

		int enumValue = m.getValue();
		log.info("Value of feb is : " + enumValue);
	}

}
