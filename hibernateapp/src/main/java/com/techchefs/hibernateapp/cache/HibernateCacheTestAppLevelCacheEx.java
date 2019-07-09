package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTestAppLevelCacheEx {
	public static void main(String[] args) {

		log.info("1st time " + getEmpployeeData(1000).toString());
		log.info("2nd time " + getEmpployeeData(1000).toString());
		log.info("3rd time " + getEmpployeeData(1000).toString());
	}

	private static EmployeeInfoNew getEmpployeeData(int id) {
		EmployeeInfoNew employeeInfoNew = null;

		try(Session session = HibernateCacheUtil.openSession();){
		employeeInfoNew = session.get(EmployeeInfoNew.class, id);
		}
		return employeeInfoNew;
	}
}
