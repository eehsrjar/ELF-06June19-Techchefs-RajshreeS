package com.techchefs.javaapp.collection;

import java.util.ArrayList;

public class ArrayListDemoForEach {

	public static void main(String[] args) {
		ArrayList<String> lls= new ArrayList<>();
		lls.add("Meena");
		lls.add("Geena");
		lls.add("Heena");
		lls.add("Teena");
		lls.add("Ena");
		lls.add(2,"Seena");		
		
		for(String s : lls)
		{
			System.out.println(s);
		}
	}

}
