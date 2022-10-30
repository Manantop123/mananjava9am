package com.util;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class emputil {
	
	public static Connection creatConnection()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/staff", "root", "");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
}
