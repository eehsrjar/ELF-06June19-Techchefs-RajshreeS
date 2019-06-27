package com.techchefs.javaapp.referenceoperator;

import lombok.extern.java.Log;

@Log
public class Pen {
	Pen() {
		log.info("Zero parametarized constructor");
	}

	void write() {
		log.info("Write in Pen");
	}
}
