package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Employee;
import com.util.emputil;

public class Employeedao {
	public static void insertdemo(Employee e)
	{
		try
		{
			Connection conn = emputil.createconnection();
			String sql = "insert into employee(fname,lname,email,mobile,Address,gender) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getMobile());
			//pst.setString(5, e.getPsw());
			//pst.setString(5, e.getCpsw());
			pst.setString(7, e.getAddress());
			pst.setString(6, e.getGender());
		
			//pst.setString(8, e.getEdu());
			//pst.setString(9, e.getHobbies());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
