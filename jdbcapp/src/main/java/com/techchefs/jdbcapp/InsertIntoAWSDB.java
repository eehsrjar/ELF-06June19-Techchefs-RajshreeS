package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class InsertIntoAWSDB {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		int noOfRows=0;
		try {
			// 1.Load the "Driver"
//			java.sql.Driver  driver = new com.mysql.jdbc.Driver();
//			DriverManager.deregisterDriver(driver);
			
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			

			// 2.Get the "DB Connection" via "Driver"
//			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db?user=root&password=root";
//			connection = DriverManager.getConnection(dbUrl);
			
			String dbUrl = "jdbc:mysql://my-db.ccpqgr5eqa2i.ap-south-1.rds.amazonaws.com:3306/mysqldb";
			connection = DriverManager.getConnection(dbUrl,"rajshree","rajshree2007");
			
			log.info("Connection Obj==>"+connection.getClass());

			// 3.Issue "SQL Queries" via "Connection"
			String query = "insert into training_info "
					+"values(?,?,?,? )";
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setString(3, args[2]);
			pstmt.setString(4,args[3]);
			noOfRows = pstmt.executeUpdate();

			log.info("Number of rows affected :"+noOfRows);

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 5.Close all JDBC Objects

			try {
				if (connection != null) {
					connection.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
