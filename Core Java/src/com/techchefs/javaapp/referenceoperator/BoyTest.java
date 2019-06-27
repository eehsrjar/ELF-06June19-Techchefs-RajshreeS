package com.techchefs.javaapp.referenceoperator;

public class BoyTest {

	public static void main(String[] args) {
		MyBoy m= Boy :: new;
		Boy b = m.getBoy("ABC", 20, 5.4);
	}

}
