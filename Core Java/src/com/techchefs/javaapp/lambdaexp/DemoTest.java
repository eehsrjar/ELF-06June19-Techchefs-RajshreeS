package com.techchefs.javaapp.lambdaexp;

import lombok.extern.java.Log;

@Log
public class DemoTest {

	public static void main(String[] args) {
		Demo a = i->log.info(""+i);
		a.print(5);
		
		Pen p =new Pen();
		Demo b = p::write;
		b.print(15);
	}

}
