package com.techchefs.javaapp.lambdaexp;

interface Square
{
	int square(int a);
}
public class CalculateSquare {

	public static void main(String[] args) {
		Square s = a -> a*a;
		int res = s.square(5);
		System.out.println(res);
	}

}
