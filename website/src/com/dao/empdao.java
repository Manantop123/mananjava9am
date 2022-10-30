package com.dao;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.employee;
import com.util.emputil;

public class empdao {
	public static void insertemployee(employee e)
	{
		try
		{
			Connection conn = emputil.createConnection();
			String sql ="insert into employee(fname,lname,gender,emailid,mobile,password,cpassword) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getGender());
			pst.setString(4, e.getEmailid());
			pst.setLong(5,e.getMobile());
			pst.setString(6, e.getPassword());
			pst.setString(7, e.getCpassword());
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
		String sql = "select * from employee";
		PreparedStatement pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    
	    while(rs.next())
	    {
	    	employee e1 = new employee();
	    	e1.setId(rs.getInt("id"));
	    	e1.setFname(rs.getString("fname"));
	    	e1.setLname(rs.getString("lname"));
	    	e1.setGender(rs.getString("gender"));
	    	e1.setEmailid(rs.getString("emailid"));
	    	e1.setMobile(rs.getLong("mobile"));
	    	e1.setPassword(rs.getString("password"));
	    	e1.setCpassword(rs.getString("cpassword"));
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
		employee e = null;
		try
		{
			Connection conn = emputil.createConnection();
			String sql="select * from employee where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				e = new employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				e.setGender(rs.getString("gender"));
				e.setEmailid(rs.getString("emailid"));
				e.setMobile(rs.getLong("mobile"));
				e.setPassword(rs.getString("password"));
				e.setCpassword(rs.getString("cpassword"));
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return e;
	}
	public static void updatemployee(employee e2)
	{
		try
		{
			Connection conn = emputil.createConnection();
			String sql = "update employee set fname=?,lname=?,gender=?,emailid=?,mobile=?,password=?,cpassword=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, e2.getFname());
			pst.setString(2, e2.getLname());
			pst.setString(3, e2.getGender());
			pst.setString(4, e2.getEmailid());
			pst.setLong(5,e2.getMobile());
			pst.setString(6, e2.getPassword());
			pst.setString(7, e2.getCpassword());
			pst.setInt(8, e2.getId());
			
			pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteemployee(int id)
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


















