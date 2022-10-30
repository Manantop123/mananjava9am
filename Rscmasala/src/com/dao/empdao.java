package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import com.bean.employee;
import com.util.emputil;

public class empdao {
	public static void insertemployee(employee e)
	{
		try
		{
			Connection conn = emputil.createconnConnection();
			String sql ="insert into employee(fname,lname,email,mobile,gender,password,cpassword) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getMobile());
			pst.setString(5, e.getGender());
			pst.setString(7, e.getPassword());
			pst.setString(7, e.getCpassword());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
