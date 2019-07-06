package com.techchefs.designpatterns;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) {
		MyImmutableClass  immutableClass=null;
		
		immutableClass=new MyImmutableClass("amc", 19, 9876543210l);
		log.info("Name : "+immutableClass.getName());
		log.info("Age : "+immutableClass.getAge());
		log.info("Phone : "+immutableClass.getPhone());
		
		immutableClass=new MyImmutableClass("ytrfhy", 45, 9876543210l);
		log.info("Name : "+immutableClass.getName());
		log.info("Age : "+immutableClass.getAge());
		log.info("Phone : "+immutableClass.getPhone());
		
	}
}
