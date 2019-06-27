package com.techchefs.javaapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MouseTest {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("First");
		Mouse m2 = new Mouse("Second");
		Mouse m3 = new Mouse("Third");
		Mouse m4 = new Mouse("Fourth");
		Mouse m5 = new Mouse("Fifth");

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);

		service.shutdown();

	}

}
