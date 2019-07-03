package com.techchefs.jdbcapp.common;

public class DriverManager {
	private DriverManager() {
		
	}
	public static Connection getConnection(String str) {
		Connection ref=null;
		if(str.equals("A")) {
			ref=new AImpl();
		}else {
			ref=new BImpl();
		}
		return ref;
		
	}

}
