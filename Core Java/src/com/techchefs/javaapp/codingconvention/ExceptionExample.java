package com.techchefs.javaapp.codingconvention;

import lombok.extern.java.Log;

@Log
public class ExceptionExample {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int res;
		try {

			res = a / b;
			log.info(""+res);

		} catch (ArithmeticException | NullPointerException e) {
			log.info("" + e.getMessage());

		} catch (Exception e) {
			log.info("Genaral");
		}
	}

}
