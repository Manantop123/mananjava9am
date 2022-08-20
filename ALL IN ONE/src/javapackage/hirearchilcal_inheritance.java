/*
package javapackage;
import java.util.Scanner;

//inheritance


/*
 * ---> 1) child class can access parent class properties.
 * ---> 2) object will always be created of derived class.
 */


/*
package javapackage;
import java.util.*;

class A1{
	int a;
	Scanner sc = new Scanner(System.in);

	void getA(){
		System.out.println("enter a value");
		a=sc.nextInt();
	}
	void showA() {
		System.out.println("value of a is\t"+  a);
	}
}

class B1 extends A1{
	int b;
	Scanner sc = new Scanner(System.in);

	void getB() {
		System.out.println("enter value of b");
		b = sc.nextInt();
	}
	void showB() {
		System.out.println("value of b is\t"+b);
	}
}

public class hirearchilcal_inheritance{
	public static void main(String[] args) {
		B1 b = new B1();
		b.getA();
		b.getB();
		b.showA();
		b.showB();
	}
}

*/

//multi-level inheritance
/*
package javapackage;

import java.util.*;

class A1{
	int a;
	Scanner sc = new Scanner(System.in);

	void getA() 
	{
		System.out.println("enter value of a");
		a= sc.nextInt();
	}
	void showA()
	{
		System.out.println("value of a is\t"+a);
	}
}
class B1 extends A1{
	int b;
	Scanner sc = new Scanner(System.in);

	void getB() 
	{
		System.out.println("enter value of a");
		b= sc.nextInt();
	}
	void showB()
	{
		System.out.println("value of a is\t"+b);
	}
}
class C1 extends B1{
	int c;
	Scanner sc = new Scanner(System.in);

	void getC() 
	{
		System.out.println("enter value of c");
		c= sc.nextInt();
	}
	void showC()
	{
		System.out.println("value of a is\t"+c);
	}
}

public class hirearchilcal_inheritance{
	public static void main(String[] args) {
		C1 c = new C1();
		c.getA();
		c.getB();
		c.getC();
		c.showA();
		c.showB();
		c.showC();
	}
}
*/

//hirerchical inheritance
/*
class A1{
	int a;
	Scanner sc = new Scanner(System.in);

	void getA()
	{
		System.out.println("enter value of a");
		a = sc.nextInt();
	}
	void showA()
	{
		System.out.println("value of a is \t"+ a);
	}
}
class B1 extends A1{
	int b;
	Scanner sc = new Scanner(System.in);

	void getB()
	{
		System.out.println("enter value of a is");
		b = sc.nextInt();
	}
	void showB()
	{
		System.out.println("value of b is\t"+b);
	}
	
}

class C1 extends A1{
	int c;
	Scanner sc = new Scanner(System.in);

	void getC()
	{
		System.out.println("enter value of c is");
		c = sc.nextInt();
	}
	void showC()
	{
		System.out.println("value of c is\t"+c);
	}
	
}


public class hirearchilcal_inheritance{
	public static void main(String[] args) {
		C1 c = new C1();
		c.getA();
		B1 b = new B1();
		b.getA();
		c.showA();
		b.showA();
	}
}

*/











