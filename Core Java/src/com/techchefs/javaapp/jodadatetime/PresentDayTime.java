package com.techchefs.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;

@Log
public class PresentDayTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		log.info(""+date.getChronology());
		log.info("Month length: "+date.lengthOfMonth());
		log.info("Current day in month: "+date.getDayOfMonth());
		LocalDate b = LocalDate.of(1950, 5, 1);
		LocalDate c = b.plusYears(100);
		Period p1 = Period.between(c, b);
		log.info(""+p1.getYears());
		Period p =Period.between(b, date);
		log.info(""+p.getYears());
		log.info(""+p.getMonths());
		log.info(""+p.getDays());
		
	}
}
