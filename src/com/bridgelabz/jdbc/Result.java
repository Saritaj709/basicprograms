package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Result {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		System.out.println("driver is loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC?user=root&password=root");
		System.out.println("connection is established");

		Statement stmt = con.createStatement();
		System.out.println("statement object is created\n");

		String query = "select * from result";
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		// Process the results returned by "SQL Queries"
		System.out.println("Student results are : \n");
		while (rs.next()) {
			int sid = rs.getInt("sid");
			String sname = rs.getString("sname");
			int marks = rs.getInt("marks");

			System.out.println("Registration Number :" + sid);
			System.out.println("Student Name  :" + sname);
			System.out.println("Student marks  :" + marks);
			System.out.println("\n");
		}

		stmt.close();
		con.close();
	}
}
