
package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.gjt.mm.mysql.Driver;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

/**
 * Hello world!
 *
 */
@Log
public  class App {
	public static void main(String[] args) {
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1.Load the "Driver"
//			java.sql.Driver  driver = new com.mysql.jdbc.Driver();
//			DriverManager.deregisterDriver(driver);
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (ClassNotFoundException | InstantiationException  | IllegalAccessException e) {
				e.printStackTrace();
			}

			// 2.Get the "DB Connection" via "Driver"
			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db?user=root&password=root";
			connection = DriverManager.getConnection(dbUrl);

			// 3.Issue "SQL Queries" via "Connection"
			String query = "select * from employee_info";
			stmt = connection.createStatement();
			rs = stmt.executeQuery(query);

			// 4."Process the results" returned by "SQL queries"
			while (rs.next()) {
				log.info("ID  ====>" + rs.getInt("id"));
				log.info("Name  ====>" + rs.getString("name"));
				log.info("Age  ====>" + rs.getInt("age"));
				log.info("Phone  ====>" + rs.getLong("phone"));
				log.info("Gender  ====>" + rs.getString("gender"));
				log.info("Salary  ====>" + rs.getDouble("salary"));
				log.info("Joining Date  ====>" + rs.getDate("joining_date"));
				log.info("Account number  ====>" + rs.getInt("account_number"));
				log.info("Email  ====>" + rs.getString("email"));
				log.info("Designation  ====>" + rs.getString("designation"));
				log.info("DOB  ====>" + rs.getDate("dob"));
				log.info("DEPT_NO  ====>" + rs.getInt("dept_no"));
				log.info("MNGR ID  ====>" + rs.getInt("mngr_id"));
				log.info("***************************************");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5.Close all JDBC Objects
			
				try {
					if (connection != null) {
					connection.close();
					}
					if(stmt != null) {
						stmt.close();
					}
					if(rs!= null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		

	}
}
