package com.techchefs.javaassessment;

public class TempCustomExceptionTest {

	public static void main(String[] args) {
		double temp=25.00;
		TempCustomException c =new TempCustomException();
		c.validateServerRoomTemp(temp);
	}

}
