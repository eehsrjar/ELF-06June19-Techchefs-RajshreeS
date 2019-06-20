package com.techchefs.javaapp.collection;

public class Product implements Comparable<Product>{
	int rating;
	String name;
	double cost;

	public Product(int rating, String name, double cost) {
		super();
		this.rating = rating;
		this.name = name;
		this.cost = cost;
	}



	@Override
	public String toString() {
		return "Product [rating=" + rating + ", name=" + name + ", cost=" + cost + "]";
	}


	/*Logic to sort based on cost*/
	@Override
	public int compareTo(Product p) {
		Double a = this.cost;
		Double b = p.cost;
		return a.compareTo(b) * -1;
	}

	/*Logic to sort based on name*/
	/*public int compareTo(Product p) {
		return (this.name).compareTo(p.name);
	}*/


}
