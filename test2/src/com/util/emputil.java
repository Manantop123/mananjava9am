package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class emputil {
	public static Connection createconnection() {
		Connection conn =null;
		try
		{
			
			Class.forName("com.mysql.jdbc.driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:7080:test","root", "");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
}
