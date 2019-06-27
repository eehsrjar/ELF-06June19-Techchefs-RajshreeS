package com.techchefs.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class StreamFilterListSort {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(45);
		l.add(5);
		l.add(40);
		l.add(9);


		Stream<Integer> si = l.stream().sorted();
		List<Integer> li =si.collect(Collectors.toList());
		log.info("" + li);

		
	}

}
