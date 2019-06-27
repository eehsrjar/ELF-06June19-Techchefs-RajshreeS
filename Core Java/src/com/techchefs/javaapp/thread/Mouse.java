package com.techchefs.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {
	String name;

	Mouse(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		log.info(name + "started");
		for (int i = 0; i < 5; i++) {
			log.info("" + i);
		}
		log.info(name + "Completed");
	}

}
