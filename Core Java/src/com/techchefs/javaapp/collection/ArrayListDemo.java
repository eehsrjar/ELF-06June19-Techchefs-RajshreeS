package com.techchefs.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(14);
		list.add(null);
		list.add(5.7);
		list.add('A');
		list.add("training");
		list.add('A');
		list.add(null);
		log.info(""+list);
		log.info(""+list.remove(0));
	}

}
