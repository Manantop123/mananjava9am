package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.bean.employee;
import com.util.emputil;

public class employeedao {
	public static void insertemployee(employee e1)
	{
		try
		{
			Connection conn = emputil.creatConnection();
			String sql = "insert into employee(fname) values(?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e1.getFname());
			pst.executeUpdate();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
