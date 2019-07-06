package com.techchefs.javaapp.jodadatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;
@Log
public class TimeZone {

	public static void main(String[] args) {
		ZoneId z= ZoneId.systemDefault();
		log.info(""+z);
		
		ZoneId t=ZoneId.of("Asia/Singapore");
		ZonedDateTime tz = ZonedDateTime.now(t);
		tz.toLocalDateTime();
	}

}
