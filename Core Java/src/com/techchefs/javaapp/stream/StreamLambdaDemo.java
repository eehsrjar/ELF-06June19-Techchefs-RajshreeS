package com.techchefs.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class StreamLambdaDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(45);
		l.add(5);
		l.add(40);
		l.add(9);
		
		Predicate<Integer> x=i->i%2 !=0;
		
		List<Integer> li=l.stream().filter(x).collect(Collectors.toList());
		log.info(""+li);
		
		List<Integer> l1=l.stream().filter(i->i%3==0).collect(Collectors.toList());
		log.info(""+l1);
		
	}
}
