package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.bean.employee;
import com.util.emputil;
import java.util.*;

public class empdao {
	public static void insertemployee(employee e)
	{
		
		try
		{
		Connection conn = emputil.createConnection();
		String sql = "insert into employee(fname,lname) values(?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, e.getFname());
		pst.setString(2, e.getLname());
		pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static List<employee> getallemployee()
	{
		List<employee> list = new ArrayList<employee>();
		try
		{
			Connection conn = emputil.createConnection();
			String sql ="select * from employee";
			PreparedStatement pst = conn.prepareStatement(sql);
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
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return list;
	}
	public static employee getemployeebyid(int id)
	{
		employee e1 = null;
		try 
		{
		Connection conn = emputil.createConnection();
		String sql ="select * from employee where id=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		
		if(rs.next())
		{
			e1= new employee();
			e1.setId(rs.getInt("id"));
			e1.setFname(rs.getString("fname"));
			e1.setLname(rs.getString("lname"));
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return e1;
	}
	public static void updateemployee(employee e2)
	{
		
		try
		{
			Connection conn = emputil.createConnection();
			String sql = "update employee set fname=?,lname=? where id =?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e2.getFname());
			pst.setString(2,e2.getLname());
			pst.setInt(3,e2.getId());
			pst.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deletemployee(int id)
	{
		try
		{
			Connection conn = emputil.createConnection();
			String sql ="delete from employee where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}	
