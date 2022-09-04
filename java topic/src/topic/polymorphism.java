//polymorphism
//
//poly means many
//morpism means forms
//
//there are two types of poly-morphism.
//1)compile time  -- method overloading
//2)run-time  --  method overriding.

package topic;
/*
class methodoverloading
{
	int add(int a,int b)
	{
		return a+b;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class polymorphism {
	public static void main(String[] args) {
		methodoverloading mo = new methodoverloading();
		System.out.println("the value of int 2 add is"+mo.add(2,2,2));
		System.out.println("the value of float 2 add is"+mo.add(2.0f,2.0f));
		System.out.println("the value of int 3 add is"+mo.add(2,2,3));
	}
}
*/

import java.util.Scanner;

public class polymorphism
{
static int a;

void getval()
{
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter value of a");
	a = sc.nextInt();
}

void printval()
{
	System.out.println("value of a is "+ a);
}		

public static void main(String[] args) {
	polymorphism p1 = new polymorphism();
	polymorphism p2 = new polymorphism();
	polymorphism p3 = new polymorphism();
	
	p1.getval();
	p2.getval();
	p3.getval();
	
	p1.printval();
	p2.printval();
	p3.printval();
}
}
