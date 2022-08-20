//multilevel inheritance
package javapackage;

import java.util.Scanner;

class A{
	int a;
	Scanner sc = new Scanner(System.in);
	
	void getA()
	{
		System.out.println("enter value of a is");
		a =sc.nextInt();
	}
	void showA()
	{
		System.out.println("valu is\t" + a);
	}
}

class B extends A{
	int b;
	Scanner sc = new Scanner(System.in);
	
	void getB()
	{
		System.out.println("enter value of b");
		b=sc.nextInt();
	}
	void showB()
	{
		System.out.println("value of b is\t"+b);
	}
}

class C extends B{
	int c;
	Scanner sc = new Scanner(System.in);

	void getC()
	{
		System.out.println("enter value of c");
		c = sc.nextInt();
	}
	void showC()
	{
		System.out.println("value of c is\t"+c);
	}
	
}
public class multilevel {
	public static void main(String[] args) {
		C c1 = new C();
		c1.getA();
		c1.showA();
		c1.getB();
		c1.showB();
		c1.getC();
		c1.showC();
	}

}
