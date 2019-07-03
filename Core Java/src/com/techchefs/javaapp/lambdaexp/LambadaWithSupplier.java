package com.techchefs.javaapp.lambdaexp;

import java.util.function.Supplier;

public class LambadaWithSupplier {

	public static void main(String[] args) {
		Supplier<Gun> s = () -> new Gun(100);
		Gun g = s.get();
		System.out.println(g.bullets);
	}

}
