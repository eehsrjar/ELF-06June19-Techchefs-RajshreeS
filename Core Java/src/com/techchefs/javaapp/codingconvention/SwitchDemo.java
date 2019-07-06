package com.techchefs.javaapp.codingconvention;

import lombok.extern.java.Log;

@Log
public class SwitchDemo {

	public static void main(String[] args) {
		String str="Flower";
		switch(str) {
		case "Flower" : log.info("Flower");
		break;
		case "Animal" : log.info("Animal");
		break;
		case "Fruit" : log.info("Fruit");
		break;
		}
		System.out.println("Welcome to \"test yantra\"!!!");//escape character backslash
	}

}
