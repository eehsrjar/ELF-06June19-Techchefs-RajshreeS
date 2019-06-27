package com.techchefs.javaapp.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class KeyBoardTest {

	public static void main(String[] args) {
		KeyBoard k = new KeyBoard();
		FutureTask<String> ft = new FutureTask<>(k);
		Thread t = new Thread(ft);
		t.start();
		try {
			String msg = ft.get();
			log.info("Message is " + msg);
		} catch (InterruptedException | ExecutionException e) {
			log.warning("Interrupted");
			Thread.currentThread().interrupt();
		}

	}

}
