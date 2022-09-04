package topic;

import java.util.Scanner;

//oops concept

//oop :- object oriented programming.
//
//there are 4 main pillar of oops.
//
//1)inheritance.
//2)polymmorphism
//3)data abstraction
//4)encapsualtion

//java doesnot support two types of inheritance

//1)multiple inheritance
//why:-
//	it gives ambiquity
	
//2)hybrid inheritance
//why :-
//	it is combination of hirerchiacal and multiple   inheritance.


//java only support three types of inheritance

//1)single level
//2)multi level
//3)hirerchical level

//example of single inheritance
/*
class A{
	Scanner sc = new Scanner(System.in);
	int a;
	
	void getvalA()
	{
		System.out.println("enter value of a");
		a=sc.nextInt();
	}
	void showvalA()
	{
		System.out.println("value of a is"+a);
	}
}
class B extends A{
	int b;
	Scanner sc = new Scanner(System.in);
	void getval()
	{
		System.out.println("enter value of b");
		b = sc.nextInt();
	}
	void showval()
	{
		System.out.println("value of b is"+b);
	}
}
public class inheritance {
	public static void main(String[] args) {
		B b1 = new B();
		b1.getvalA();
		b1.showvalA();
		b1.getval();
		b1.showval();
	}
}

*/

//example of multi-level inheritance

/*

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
		System.out.println("value of a is"+a);
	}

}
class  B extends A{
	int b;
	Scanner sc = new Scanner(System.in);
	void getb()
	{
		super.getA();
		System.out.println("enter value of b");
		b = sc.nextInt();
	}
	void showb()
	{
		super.showA();
		System.out.println("value of b is"+b);
	}	
}
class C extends B{
	int c;
	Scanner sc = new Scanner(System.in);
	
	void getc()
	{
		System.out.println("enter value of c");
		c = sc.nextInt();
	}
	void showc()
	{
		System.out.println("value of c is"+c);
	}
}
public class inheritance{
	public static void main(String[] args) {
		C c1 = new C();
		c1.getA();
		c1.showA();
		c1.getb();
		c1.showb();
		c1.getc();
		c1.showc();
	}
}
*/


//hirerchical inheritance

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
		System.out.println("value of a is"+a);
	}
}
class B{
	int b;
	Scanner sc = new Scanner(System.in);
	
	void getB()
	{
		System.out.println("enter value of b");
		b = sc.nextInt();
	}
	void showB()
	{
		System.out.println("value of a is"+b);
	}	
}
class C{
	int c;
	Scanner sc = new Scanner(System.in);
	
	void getC()
	{
		System.out.println("enter value of c");
		c = sc.nextInt();
	}
	void showC()
	{
		System.out.println("value of a is"+c);
	}
	
}
public class inheritance{
	public static void main(String[] args) {
		C c1 = new C();
		B b1 = new B();
		
	}
}





































































































































