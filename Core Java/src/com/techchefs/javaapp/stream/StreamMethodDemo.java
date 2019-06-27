package com.techchefs.javaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class StreamMethodDemo {

	public static void main(String[] args) {
		Integer[] a= {2,7,4,0,1,7};
		Stream<Integer> s =Stream.of(2,7,4,0,1,7);
		s.forEach(i->log.info("Value is "+i));
		s.forEach(System.out::println);
	}

}
