package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class StatementExTwoJdbcProgram {

	public static void main(String[] args) {

		Connection connection = null;
		Statement stmt = null;
		int noOfRows=0;
		try {
			// 1.Load the "Driver"
//			java.sql.Driver  driver = new com.mysql.jdbc.Driver();
//			DriverManager.deregisterDriver(driver);
			
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			

			// 2.Get the "DB Connection" via "Driver"
//			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db?user=root&password=root";
//			connection = DriverManager.getConnection(dbUrl);
			
			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db";
			connection = DriverManager.getConnection(dbUrl,"root","root");
			
			log.info("Connection Obj==>"+connection.getClass());

			// 3.Issue "SQL Queries" via "Connection"
			String query = "insert into training_info "
					+"values(3,'Architect','15 days','Training Institute' )";
			stmt = connection.createStatement();
			noOfRows = stmt.executeUpdate(query);

			log.info("Number of rows affected :"+noOfRows);

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 5.Close all JDBC Objects

			try {
				if (connection != null) {
					connection.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
