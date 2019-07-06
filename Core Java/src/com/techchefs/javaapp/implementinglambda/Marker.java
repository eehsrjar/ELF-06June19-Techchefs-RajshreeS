package com.techchefs.javaapp.implementinglambda;

import lombok.extern.java.Log;

@Log
public class Marker {
	public static void main(String[] args) {
		log.info("Main Started");
		Runnable r = ()->{
			for(int i=0;i<5;i++) {
				log.info(""+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		Thread t2 =new Thread();
		t2.start();
		log.info("Main ended");
	}
}
