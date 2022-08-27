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
