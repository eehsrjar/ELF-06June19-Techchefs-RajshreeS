package com.techchefs.javaapp.collection;

import java.util.TreeSet;

public class CarTreeSet {

	public static void main(String[] args) {
		TreeSet<Car> ct = new TreeSet<Car>();
		
		Car c1 = new Car("Dezire",900000.00,"MAruti Suzuki", 8);
		Car c2 = new Car("Swift",700000.00,"Maruti Suzuki", 7);
		Car c3 = new Car("Superb",11500000.00,"Skoda",10);
		Car c4 = new Car("Benz",1200000.00,"BMW",9);
		
		ct.add(c1);
		ct.add(c2);
		ct.add(c3);
		ct.add(c4);
		
		for(Car c : ct)
		{
			System.out.println(c);
		}
	}

}
