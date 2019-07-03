package com.techchefs.jdbcapp.common;

public class ClassTest {

	public static void main(String[] args) {
		//String str="A";
		Connection con=DriverManager.getConnection(args[0]);
		con.toString();
		con.printMessage();
	}

}
