package com.techchefs.javaapp.assignment.streamlambdaassignment;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
public class ProductComparator {
	public static void main(String[] args) {
		Product p1 = new Product(2,"pen", 88);
		Product p2 = new Product(5,"marker", 15.9);
		Product p3 = new Product(1,"notes", 23.9);
		Product p4 = new Product(6,"sweet", 60);
		Product p5 = new Product(45,"mobile",  11000);

		Comparator<Product> sortName = (i, j) -> i.name.compareTo(j.name);
		Comparator<Product> sortCost = (i, j) -> {
			Double a = i.cost;
			Double b = j.cost;
			return a.compareTo(b);
		};
		Comparator<Product> sortRating = (i, j) -> {
			Integer a = i.id;
			Integer b = j.id;
			return a.compareTo(b);
		};
		TreeSet<Product> t = new TreeSet<Product>(sortName);
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		for (Product el : t) {
			log.info(""+el);
		}
	}
	

}



