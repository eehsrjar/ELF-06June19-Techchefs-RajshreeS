package com.techchefs.javaapp.implementinglambda;

import lombok.extern.java.Log;

@Log
public class MarkerInline {
	public static void main(String[] args) {
		log.info("Main Started");
		Thread t = new Thread(()->{
			for(int i=0;i<5;i++) {
				log.info(""+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t.start();
		log.info("Main ended");
	}
}
