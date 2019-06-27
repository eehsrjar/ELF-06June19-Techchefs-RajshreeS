package com.techchefs.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				log.severe("Interrupted");
			}
			log.info(""+i);
		}
		String s = getName();
		log.info(s);
	}

}
