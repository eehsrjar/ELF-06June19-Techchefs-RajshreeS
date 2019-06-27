package com.techchefs.javaapp.referenceoperator;

import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class ProductTest {
	public static final Logger loger = Logger.getLogger("Reference");

	public static void main(String[] args) {
		MyProduct m = Product::new;
		Product p = m.getProductDetails("Mouse", 2000.00);
		log.info("Name is " + p.name);
		log.info("Cost is " + p.cost);
	}

}
