package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.employeebean;
import com.util.emputil;

public class employeedao {
	public static void insertemployee(employeebean e)
	{
		try
		{
			Connection conn = emputil.createConnection();
			String sql = "insert into emp(fname,lname,email,mobile,address,gender) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getMobileno());
			pst.setString(5, e.getAddress());
			pst.setString(6, e.getGender());
			pst.executeUpdate();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
}
