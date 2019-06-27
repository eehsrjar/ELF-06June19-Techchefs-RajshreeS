package com.techchefs.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class StreamFilterListSortDesc {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(45);
		l.add(5);
		l.add(40);
		l.add(9);

		Comparator<Integer> c = (i, j) -> i.compareTo(j) * -1;

		List<Integer> li = l.stream().sorted(c).collect(Collectors.toList());
		log.info("" + li);
		
		li.stream().forEach(i->log.info(""+i));

	}

}
