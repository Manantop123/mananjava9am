package jdbc;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/* 1step -> create text area using jframe class
 * 
 * 2ndstep - > add component in text area.
 * 
 * note : swing doesnot set layout for developer but provide classs for layout
 * 
 * 3rd step - > 
 * 
 * 
 * 
 */

public class design {

	JFrame f;
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4;
	
	design()
	{

		f = new JFrame("Employee registration");
		f.setVisible(true);
		f.setSize(500,500);
		//f.setLayout(new FlowLayout());
		f.setLayout(null);
		f.setResizable(false);
		
		
		l1 = new JLabel("First Name");
		l2 = new JLabel("Last Name");
		l3 = new JLabel("Mobile no");
		l4 = new JLabel("Email id");
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		
		b1 = new JButton("Insert");
		b2 = new JButton("Search");
		b3 = new JButton("update");
		b4 = new JButton("delete");
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		//setbound follow(Y , X , W , H)
		
		l1.setBounds(50,50,100,80);
		l2.setBounds(50,100,100,80);
		l3.setBounds(50,150,100,80);
		l4.setBounds(50,200,100,80);
		
		t1.setBounds(150,80,150,30);
		t2.setBounds(150,130,150,30);
		t3.setBounds(150,180,150,30);
		t4.setBounds(150,230,150,30);
		
		b1.setBounds(50, 280, 100, 30);
		b2.setBounds(200, 280, 100, 30);
		b3.setBounds(50, 330, 100, 30);
		b4.setBounds(200, 330, 100, 30);
		
//		b1.addActionListener(this);
//		b2.addActionListener(this);
//		b3.addActionListener(this);
//		b4.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		new design();
	}
}
