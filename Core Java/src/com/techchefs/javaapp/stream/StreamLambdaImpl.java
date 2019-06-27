package com.techchefs.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class StreamLambdaImpl {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(45);
		l.add(5);
		l.add(40);
		l.add(9);
		
		List<Integer> li = l.stream().map(i->i*2).collect(Collectors.toList());
		log.info(""+li);
	}
}
