package com.dao;
import java.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.employee;
import com.sun.xml.internal.bind.v2.model.core.ID;
import com.util.emputil;

public class empdao {
	private static final int ID = 0;
	public static void insertemployee(employee e1)
	{
		try
		{
			Connection conn = emputil.creatConnection();
			String sql ="insert into test(fname,lname) values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e1.getFname());
			pst.setString(2, e1.getLname());
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
			Connection conn = emputil.creatConnection();
			String sql = "select * from test";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				employee e1 = new employee();
				e1.setId(rs.getInt("id"));
				e1.setFname(rs.getString("fname"));
				e1.setLname(rs.getString("lname"));
				list.add(e1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public static employee getemployeebyid(int id)
	{
		employee e = null;
		
		try
		{
			Connection conn = emputil.creatConnection();
			String sql ="select * from test where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				e =  new employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace(); 
		}
		return e;
	}
}
