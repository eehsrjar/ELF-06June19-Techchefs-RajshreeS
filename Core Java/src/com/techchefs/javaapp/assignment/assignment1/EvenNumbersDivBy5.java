package com.techchefs.javaapp.assignment.assignment1;

public class EvenNumbersDivBy5 {

	public static void main(String[] args) {
		System.out.println("Even numbers between 50 to 100 divisible by 5");
		for(int i = 50;i <= 100;i++) {
			if(i % 2 == 0 && i % 5 ==0) {
				System.out.println(i);
			}
		}
	}

}
