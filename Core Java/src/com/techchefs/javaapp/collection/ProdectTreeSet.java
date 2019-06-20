package com.techchefs.javaapp.collection;

import java.util.TreeSet;

public class ProdectTreeSet {

	public static void main(String[] args) {
		TreeSet<Product> pt=new TreeSet<Product>();
		
		Product p1=new Product(3, "Pen", 10.50);
		Product p2=new Product(5, "Book", 450.50);
		Product p3=new Product(4, "Mobile Phone", 10000.00);
		Product p4=new Product(2, "Screen guard", 200.00);
		
		pt.add(p1);
		pt.add(p2);
		pt.add(p3);
		pt.add(p4);
		
		for(Product p :pt)
		{
			System.out.println(p);
		}
		
	}

}
