package com.techchefs.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class BImpl implements Connection{

	@Override
	public void printMessage() {
		log.info("B class Impl");
	}

}
