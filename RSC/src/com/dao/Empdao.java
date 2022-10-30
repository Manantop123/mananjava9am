package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

import com.bean.Employee;
import com.util.Emputil;

public class Empdao {
	public static void insertemployee(Employee e)
	{
		try
		{
			Connection conn = Emputil.CreateConnection();
			String sql = "insert into (fname,lname,email,mobile,gender,address) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			pst.setLong(4,e.getMobile());
			pst.setString(5, e.getGender());
			pst.setString(6, e.getAddress());
			pst.executeUpdate();	
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
}
