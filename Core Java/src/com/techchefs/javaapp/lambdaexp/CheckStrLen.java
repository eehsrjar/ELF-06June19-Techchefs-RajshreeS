package com.techchefs.javaapp.lambdaexp;

import java.util.logging.Logger;

public class CheckStrLen {
	private static final Logger log = Logger.getLogger("Assignment");
	public static void main(String[] args) {
		StringLength s = str -> str.length();

		int res = s.getStrLen("Techchefs");
		log.info(""+ res);
	}

}
