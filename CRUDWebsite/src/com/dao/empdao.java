package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.employee;
import com.sun.org.apache.regexp.internal.recompile;
import com.util.emputil;

public class empdao {
	public static void insertemployee(employee e)
	{
		try
		{
			Connection conn = emputil.creatConnection();
			String sql = "insert into employee(fname,email,mobile,password,cpassword) values(?,?,?,?,?)";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getEmail());
			pst.setLong(3, e.getMobile());
			pst.setString(4, e.getPassword());
			pst.setString(5, e.getCpassword());
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
			Connection conn = emputil.creatConnection();
			String sql ="select * from employee";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				employee e1 = new employee();
				e1.setId(rs.getInt("id"));
				e1.setFname(rs.getString("fname"));
				e1.setEmail(rs.getString("email"));
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
			Connection conn = emputil.creatConnection();
			String sql ="select * from employee where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				e = new employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
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
	public static void updatemployee(employee e)
	{
		try
		{
			Connection conn = emputil.creatConnection();
			String sql ="update employee set fname=?,email=?,mobile=?,password=?,cpassword=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, e.getFname());
			pst.setString(2, e.getEmail());
			pst.setLong(3, e.getMobile());
			pst.setString(4, e.getPassword());
			pst.setString(5, e.getCpassword());
			pst.setInt(6,e.getId() );
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static void deletemployee(int id)
	{
		try
		{
			Connection conn = emputil.creatConnection();
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
	public static void deleteemp(int id)
	{
		try
		{
			Connection conn = emputil.creatConnection();
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
