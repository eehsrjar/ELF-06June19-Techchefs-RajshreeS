package com.techchefs.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class ArrayListStream {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(8);
		l.add(2);
		l.add(1);
		l.add(60);
		
		List<Integer> li = l.stream().sorted().collect(Collectors.toList());

		for(Integer i : li) {
			log.info(""+i);
		}
		Comparator<Integer> m = (i,j)->i.compareTo(j);
		int min=l.stream().min(m).get();
		log.info(""+min);
		int max=l.stream().max(m).get();
		log.info(""+max);
	}
}
