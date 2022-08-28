/*
package javapackage;

import java.util.Scanner;

public class exception {
	public static void main(String[] args) {
		try {
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter value of a");
		a = sc.nextInt();
		System.out.println("enter value of  b");
		b = sc.nextInt();
		c = a/b;
		System.out.println("c is"+ c);
		}
		catch(Exception e)
		{
			System.out.println("exeception");
		}
	}
	
}
*/
/*
package javapackage;

import java.util.Scanner;

public class exception {
	
	public static void demo()
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter A: ");
			a = sc.nextInt();
			if(a > 0)
			{
				System.out.println("Square of A : "+ (a*a));				
			}
			else 
			{
				throw new Exception("Please Enter +ve Value");				
			}
				
		}
		catch(Exception e){
			System.out.println("Exception caught"+e);
			demo();
		}
	}
	
	
	public static void main(String[] args) {
		demo();
	}

}
*/

package javapackage;

import java.util.*;

interface ifs1{
	
	void meth1();
}

interface ifs2 extends ifs1{
	void meth2();
}



class ABC implements ifs1,ifs2{

	
	public void meth2() {
		System.out.println("Meth2 Defined in ABC");
		
	}

	
	public void meth1() {
		System.out.println("Meth1 Defined in ABC");
		
	}
	
}


class XYZ implements ifs2{

	@Override
	public void meth1() {
		System.out.println("Meth1 Defined in XYZ");
		
	}

	@Override
	public void meth2() {
		System.out.println("Meth2 Defined in XYZ");
		
	}
	
}


public class exception {

	public static void main(String[] args) {
		
		ABC a = new ABC();
		a.meth1();
		a.meth2();
		
		XYZ x = new XYZ();
		x.meth1();
		x.meth2();
		
	}
}




























