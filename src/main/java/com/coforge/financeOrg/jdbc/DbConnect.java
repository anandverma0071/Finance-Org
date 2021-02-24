package com.coforge.financeOrg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
	static Connection con = null;
	static String url = "jdbc:mysql://localhost:3306/fincom";
	static String username = "root";
	static String password = "root";

	public static Connection dbConnect() throws SQLException {
		try {
			System.out.println("Connecting To Database");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			System.out.println("print stack printed");
			e.printStackTrace();
		}
		return con;
	}
}
