package com.techchefs.javaapp.thread;

import java.util.concurrent.Callable;

public class KeyBoard implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "Hi Good evening";
	}

}
