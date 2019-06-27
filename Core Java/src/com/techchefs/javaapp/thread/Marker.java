package com.techchefs.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable{

	@Override
	public void run() {
		log.info("In Marker run()");
		for (int i = 0; i < 5; i++) {
			log.info(""+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
