package com.techchefs.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Theater {
	synchronized void book() {
		for (int i = 0; i < 5; i++) {
			log.info("" + i);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void release() {
		notify();
	}
}
