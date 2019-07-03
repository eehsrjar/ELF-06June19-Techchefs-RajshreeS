package com.techchefs.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class AImpl implements Connection{

	@Override
	public void printMessage() {
		log.info("A class Impl");
	}

}
