package com.techchefs.javaapp.lambdaexp;

public class CheckStrLen {

	public static void main(String[] args) {
		StringLength s = str -> str.length();
		
		int res = s.getStrLen("Techchefs");
		System.out.println(res);
	}

}
