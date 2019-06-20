package com.techchefs.javaapp.collection;

public class Car implements Comparable<Car>{
	
	String name;
	double cost;
	String brand;
	int rating;	
	
	public Car(String name, double cost, String brand, int rating) {
		super();
		this.name = name;
		this.cost = cost;
		this.brand = brand;
		this.rating = rating;
	}
	

	@Override
	public String toString() {
		return "Car [name=" + name + ", cost=" + cost + ", brand=" + brand + ", rating=" + rating + "]";
	}


	@Override
	public int compareTo(Car c) {
		Integer a =this.rating;
		Integer b = c.rating;
	
		return a.compareTo(b);
	}



	/*Logic to sort based on brand*/
	/*
	 * @Override public int compareTo(Car c) { return
	 * (this.brand).compareTo(c.brand); }
	 */
}
