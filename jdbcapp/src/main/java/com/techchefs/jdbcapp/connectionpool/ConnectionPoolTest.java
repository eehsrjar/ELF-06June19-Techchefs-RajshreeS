package com.techchefs.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class ConnectionPoolTest {

	public static void main(String[] args) {

		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool = null;
		try {
			pool = ConnectionPool.getConnectionPool();
			connection = pool.getConnectioFromPool();

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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5.Close all JDBC Objects

			try {
				if (pool != null) {
					pool.returnConnectionToPool(connection);
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
