package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class emputil {
	public static Connection creConnection()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demowebsite", "root", "");
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return conn;
	}
}
