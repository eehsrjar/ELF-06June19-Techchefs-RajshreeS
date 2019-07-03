package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class FirstJdbcProgramTryWithResources {

	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db";
		String query = "select * from employee_info";

		try (Connection connection = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

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

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			e.printStackTrace();
		}

	}
}
