package com.techchefs.javaapp.lambdaexp;

import java.util.function.Consumer;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("neha", 60, 70, 80);
		s.average(s);
		Consumer<Student> c = st -> {
			double a = (st.m1 + st.m2 + st.m3) / 3.0;
			System.out.println(st.name + " average is " + a);
		};
		c.accept(s);

	}

}
