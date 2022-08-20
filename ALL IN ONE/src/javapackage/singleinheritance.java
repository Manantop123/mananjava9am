package javapackage;

import java.util.Scanner;

//parent class
class A{
	int a;
	Scanner sc = new Scanner(System.in);

	void getA()
	{
		System.out.println("enter value of a");
		a = sc.nextInt();
	}
	void showA()
	{
		System.out.println("value of a is\t" + a);
	}
}

//child class

class B extends A{
	int b;
	Scanner sc = new Scanner(System.in);

	void getB()
	{
		System.out.println("enter value of b");
		b = sc.nextInt();
	}
	void showB()
	{
		System.out.println("value of b is\t "+b);
	}
}



public class singleinheritance {
	public static void main(String[] args) {
		B b = new B();
		b.getA();
		b.showA();
		b.getB();
		b.showB();
	}
}
