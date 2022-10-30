package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.bean.employee;
import com.sun.org.apache.regexp.internal.recompile;
import com.util.emputil;

public class empdao {
	public static void insertemployee(employee e)
	{
		try
		{
			Connection conn = emputil.creConnection();
			String sql ="insert into employee(fname,gender,email,mobile,password,cpassword) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,e.getFname());
			pst.setString(2, e.getGender());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getMobile());
			pst.setString(5, e.getPassword());
			pst.setString(6, e.getCpassword());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static List<employee> getemployeebyid()
	{
		List<employee> list = new ArrayList<employee>();
		try {
			Connection conn = emputil.creConnection();
			String sql = "select * from employee";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				employee e = new employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setGender(rs.getString("gender"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getLong("mobile"));
				e.setPassword(rs.getString("password"));
				e.setCpassword(rs.getString("cpassword"));
				list.add(e);
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
			Connection conn = emputil.creConnection();
			String sql= "select * from employee where id =?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				e = new employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setGender(rs.getString("gender"));
				e.setEmail(rs.getString("email"));
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
}
