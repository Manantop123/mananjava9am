package jdbc;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Driver;



/* 1step -> create text area using jframe class
 * 
 * 2ndstep - > add component in text area.
 * 
 * note : swing doesnot set layout for developer but provide classs for layout
 * 
 * 3rd step - > set bound (y,x,w,h)
 * 
 * 4th step -> is to check cliek event is working or not if its working then follow 5th step.	
 * 
 * 
 * 5th steo -> we have cliek event now add listner using actionlistener implemnt class
 * 
 * 6the step -> use getsource() method
 * 
 * 7th -> use addactionlistnet in contructor
 * 
 * now JDBC (java database connectivity)
 * 
 * 
 * 	prequisite :
 * 
 * 		1-> need bridge between java and databse mysql we can create using JAR file(java archives files) is also called mysql connector.
 * 
 * 		2-> install xampp(cross platform mysql php perl)
 * 	
 * 		3->sqlyog is database compiler. 
 * 
 * 		there are 6 step to connect with JDBC step :-
 * 
 * 			1) import the driver
 * 			
 * 			class forname("com.mysql.jdbc.driver")
 * 
 * 			2)establish connection
 * 
 * 			drivermanager.getconnection("url","username","password")
 * 			
 * 			3)write the query
 * 	
 * 			String sql = insert into table_name() values();
 * 
 * 			4)prepare the statement
 * 
 * 			preparedstatment pr = conn.preparedstatment(sql)
 * 
 * 			5)Execute the statement
 * 
 * 			insert/update/delete -> executeupdate()
 * 
 * 			select - > resultset rs = executequery()
 * 
 * 
 * 			6)close the connectcion
 * 	
 * 			conn.close();
 */

public class design implements ActionListener{

	JFrame f;
	JTextField t1,t2,t3,t4,t5;
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2,b3,b4;
	
	design()
	{

		f = new JFrame("Employee registration");
		f.setVisible(true);
		f.setSize(500,500);
		//f.setLayout(new FlowLayout());
		f.setLayout(null);
		f.setResizable(false);
		
		l5 = new JLabel("id");
		l1 = new JLabel("First Name");
		l2 = new JLabel("Last Name");
		l3 = new JLabel("Email");
		l4 = new JLabel("Mobile no");
		
		t5 = new JTextField(20);
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		
		b1 = new JButton("Insert");
		b2 = new JButton("Search");
		b3 = new JButton("update");
		b4 = new JButton("delete");
		
		f.add(l5);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		
		f.add(t5);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		//setbound follow(x , y , W , H)
		
		
		l5.setBounds(50, 100, 50, 30);
		l1.setBounds(50,150,50,30);
		l2.setBounds(50, 200 , 50, 30);
		l3.setBounds(50, 250 , 50, 30);
		l4.setBounds(50, 300,50, 30);
//		l2.setBounds(50,90,100,80);
//		l3.setBounds(50,120,100,80);
//		l4.setBounds(50,140,100,80);
//		
		t5.setBounds(150, 90,150 , 30);
		t1.setBounds(150, 150, 150, 30);
		t2.setBounds(150, 210, 150, 30);
		t3.setBounds(150, 260, 150, 30);
		t4.setBounds(150, 310,150, 30);

		t5.setBounds(150, 80, 150, 30);
		t1.setBounds(150,130,150,30);
		t2.setBounds(150,180,150,30);
		t3.setBounds(150,230,150,30);
		t4.setBounds(150,280,150,30);
		
		b1.setBounds(50,350 , 100, 30);
		b2.setBounds(200, 350, 100, 30);
    	b3.setBounds(50, 400, 100, 30);
		b4.setBounds(200, 400, 100, 30);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//import driver
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/july19","root","");
				//establish connection 
				
				String str = "insert into employee(fname,lname,email,mobile) values(?,?,?,?)";
			    //write query
				
				//prepare the statment
				PreparedStatement pst = conn.prepareStatement(str);
				
				pst.setString(1, t1.getText());
				pst.setString(2, t2.getText());
				pst.setString(3, t3.getText());
				pst.setString(4, t4.getText());
				
				//execute update statment
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(f,"data import successfully");
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ae.getSource() == b2)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//import driver
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/july19", "root", "");
				//establish connection
				
				String str = "select * from employee where id = ?";
				//write the query
				
				PreparedStatement pst = conn.prepareStatement(str); 
				//preparedstatment
				
				pst.setInt(1, Integer.parseInt(t5.getText()));
				
				ResultSet rs = pst.executeQuery();
				//execute query
				
				if(rs.next())
				{
					t1.setText(rs.getString("fname"));
					t2.setText(rs.getString("lname"));
					t3.setText(rs.getString("email"));
					t4.setText(rs.getString("mobile"));
				}
				
				JOptionPane.showMessageDialog(f, "data searched succesfully");
				
//				t5.setText("");
//				t1.setText("");
//				t2.setText("");
//				t3.setText("");
//				t4.setText("");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else if(ae.getSource()==b3)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//import driver
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/july19", "root", "");
				//establish connection
				
				String str = "update employee set fname=?,lname=?,email=?,mobile=? where id =?";
				//write query
				
				PreparedStatement pst = conn.prepareStatement(str);
				
				pst.setString(1,t1.getText());
				pst.setString(2,t2.getText() );
				pst.setString(3, t3.getText());
				pst.setString(4, t4.getText());
				pst.setInt(5, Integer.parseInt(t5.getText()));
				//preparedstatment
				
				pst.executeUpdate();
				//Execute statment
				
				JOptionPane.showMessageDialog(f, "data update successfully");
				
				t5.setText("");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b4)
		{	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//import driver
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/july19","root","");
				//establish connection
				
				//write query
				
				String str = "delete from employee where id = ?";
				
				//prepared statment
				PreparedStatement pst = conn.prepareStatement(str);
				
				pst.setInt(1,Integer.parseInt(t5.getText()));
				
				pst.executeUpdate();
				//execute statement
				
				//view message
				JOptionPane.showMessageDialog(f, "deleted successfully");

				//for blank
					
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public static void main(String[] args) {
		new design();

	}
}
