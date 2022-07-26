package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.employee;
import com.util.emputil;

public class empdao {
	public static void insert(employee e1)
	{
		try
		{
			Connection conn = emputil.creatConnection();
			String sql ="insert into employee(fname,email,gender,password) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e1.getFname());
			pst.setString(2, e1.getEmail());
			pst.setString(3,e1.getGender());
			pst.setString(4, e1.getPassword());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static List<employee> getemployee()
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
				e1.setGender(rs.getString("gender"));
				e1.setPassword(rs.getString("password"));
				list.add(e1);
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return list;
	}
	public static employee getbyid(int id)
	{
		employee e = null;
		try
		{
			Connection conn = emputil.creatConnection();
			String sql ="select * from employee where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1,id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				e = new employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setEmail(rs.getString("email"));
				e.setGender(rs.getString("gender"));
				e.setPassword(rs.getString("password"));
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		return e;
	}
	public static void updatemployee(employee e1)
	{

		try
		{
			Connection conn = emputil.creatConnection();
			String sql = "update employee set fname=?,email=?,gender=?,password=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, e1.getId());
			pst.setString(2, e1.getFname());
			pst.setString(3, e1.getEmail());
			pst.setString(4, e1.getGender());
			pst.setString(5, e1.getPassword());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
