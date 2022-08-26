package javapackage;
import java.util.*;


/*
 *  Polymorphism :  Poly -> Many
 *  				morphism -> Forms.
 *  
 *   There are 2 Types of Polymorphism
 *   
 *   1) Compile-Time Polymorphism : It is also called as Static Polymorphism.
 *   
 *    					e.g Method-overloading 
 *    
 *   2) Run-Time Polymorphism :  It is also called as Dynamic Polymorphism.
 *   		
 *   					e.g Method-overriding.
 *  
 * 
 *  Method-overriding : It is same return-type,same function-name and same parameters.
 *  					Same Signature.
 *  
 *  
 *  Method-overloading : Same Function-name, but different Parameters and different return-type.
 * 
 * 
 * 
 * 
 */
/*

class MethodOverloadingDemo{
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	float add(float a1,float b1)
	{
		return a1+ b1;
	}
	
	int add(int a, int b,int c)
	{
		return a+b+c;
	}
	
	
}


public class polymorphism {

	public static void main(String[] args) {
		
		MethodOverloadingDemo mo = new MethodOverloadingDemo();
		System.out.println("Addition = "+mo.add(54, 74));
		System.out.println("Addition = "+mo.add(5.6f, 74.5f));
		System.out.println("Addition = "+mo.add(3,3,5));
	}
}

*/

//static keyword example
/*
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
*/

//static method example
/*
public class  polymorphism{

	static int a =10;
	 static int b;
	
	static void meth(int x)
	{
		System.out.println("X = "+ x);
		System.out.println("A = "+ a);
		System.out.println("B = "+ b);
	}
	
	{
		System.out.println("Block 1 Called");
	}
	
	 {
		System.out.println("Static block Initialized");
		b = a*4;
	}
	
	{
		System.out.println("Block 2 called");
	}
	
	
	public static void main(String[] args) {
		polymorphism s1 = new polymorphism();
		meth(12);
	}
}
*/
//final keyword
class final1{
	
final int a = 100;

final void show()
{
	
	System.out.println("A = "+a);
}
}

class final2  extends final1{

//void show()
//{
//
//}
}


public class polymorphism {

public static void main(String[] args) {
	final1 f1 = new final1();
	f1.show();
}
}


























