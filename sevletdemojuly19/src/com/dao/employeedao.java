package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	public static List<employeebean> getAllemployee()
	{
		List<employeebean> list = new ArrayList<employeebean>();
		
		try
		{
			Connection conn = emputil.createConnection();
			String sql = "select * from emp";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				employeebean e1 = new employeebean();
				e1.setId(rs.getInt("id"));
				e1.setFname(rs.getString("fname"));
				e1.setLname(rs.getString("lname"));
				e1.setEmail(rs.getString("email"));
				e1.setMobileno(rs.getLong("mobile"));
				e1.setAddress(rs.getString("address"));
				e1.setGender(rs.getString("gender"));
				list.add(e1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
}

 












