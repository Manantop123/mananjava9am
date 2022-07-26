package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.employee;
import com.util.emputil;

public class empdao {
	public static void insertemployee(employee e1)
	{
		try
		{
		Connection conn = emputil.createConnection();
		String sql= "insert into employee(fname) values(?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, e1.getFname());
		pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static List<employee> getallemployee()
	{
		List<employee> list = new ArrayList<employee>();
		try {
			Connection conn = emputil.createConnection();
			String sql ="select * from employee";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				employee e1 = new employee();
				e1.setId(rs.getInt("id"));
				e1.setFname(rs.getString("fname"));
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
