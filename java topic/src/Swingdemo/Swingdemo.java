package Swingdemo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swingdemo implements ActionListener{

	JFrame f;

	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4;
	
	Swingdemo() 
	{
		f = new JFrame("Employee registartion");
		f.setVisible(true);
		f.setSize(500, 500);
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout());
		f.setLayout(null);
		f.setResizable(false);
		
		
		
		
		l1=new JLabel("First Name");
		l2=new JLabel("Last Name");
		l3=new JLabel("Email");
		l4 = new JLabel("Mobile No");
		
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		
		b1 = new JButton("insert");
		b2 = new JButton("search");
		b3 = new JButton("update");
		b4 = new JButton("delete");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		l1.setBounds(50,50,100,80);
		l2.setBounds(50,100,100,80);
		l3.setBounds(50,150,200,80);
		l4.setBounds(50,200,100,80);
		
		t1.setBounds(150,80,150,25);
		t2.setBounds(150,120,150,25);
		t3.setBounds(150,170,150,25);
		t4.setBounds(150,220,150,25);
		
		b1.setBounds(50,280,100,30);
		b2.setBounds(200,280,100,30);
		b3.setBounds(50,330,100,30);
		b4.setBounds(200,330,100,30);		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if(ae.getSource() == b1)
		{
			System.out.println("insert clicked");
		}
		else if(ae.getSource()==b2)
		{
			System.out.println("Search");
		}
		else if (ae.getSource()==b3)
		{
			System.out.println("update");
		}
		else if (ae.getSource() ==b4)
		{
			System.out.println("delete");
		}
		
	}

	public static void main(String[] args) {
		new Swingdemo();
	}
}
