package com.techchefs.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class BrowserTest {

	public static void main(String[] args) {
		log.info("Main Method Started");
		Theater t = new Theater();

		Browser b = new Browser(t);
		b.start();

		Browser b1 = new Browser(t);
		b1.start();
		log.info("Main Method ended");
	}

}

