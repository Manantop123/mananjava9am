package com.dao;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.bean.employee;
import com.util.emputil;

public class empdao {
	public static void insertemployee(employee e)
	{
		try
		{
				Connection conn = emputil.creatConnection();
				String sql ="insert into employee(fname,lname) values(?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, e.getFname());
				pst.setString(2, e.getLname());
				pst.executeUpdate();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
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
				employee e = new employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				list.add(e);
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		
		
		return list;
	}
	public static employee getemployeeById(int id)
	{
		employee e = null;
		try 
		{
			Connection conn = emputil.creatConnection();
			String sql ="select * from employee where id =?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1,id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				e = new employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
			}
		}
		catch(Exception e2){
			e2.printStackTrace();
		}
		return e;	
	}
}
