package com.techchefs.javaapp.assignment.streamlambdaassignment;

public class Product {
	int id;
	String name;
	double cost;

	public Product(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
 
}
