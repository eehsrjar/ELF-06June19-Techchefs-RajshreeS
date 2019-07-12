package com.techchefs.javaapp.assignment.lambadaassignment;

import java.util.logging.Logger;

public class PrintStringMsgTest {
	private static final Logger log = Logger.getLogger("Assignment");
	public static void main(String[] args) {
		PrintStringMsg pmsg = str -> {
			log.info(str);
		};
		
		pmsg.print("GOod morning");
	}

}
