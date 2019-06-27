package com.techchefs.javaapp.thread;

public class Browser extends Thread {
	Theater ref;

	public Browser(Theater ref) {
		this.ref = ref;
	}

	@Override
	public void run() {
		ref.book();
	}
}
