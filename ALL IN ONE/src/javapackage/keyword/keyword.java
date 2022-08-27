/*
package javapackage.keyword;

import java.util.Scanner;

//static keyword

 * 
 * 1) it is keyword.
 * 2) for static keyword we dont need to create an object for calling static method it call by its class name/method name.
 * 3) static keyword is called before main method.
 * 4) it is used to common memory managment.
 * 
 

public class keyword {
	static int i;
	void setval()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of i");
		i = sc.nextInt();
		
	}
	void printval()
	{
		System.out.println("value of a is " + i);
	}
	public static void main(String[] args) {
		keyword k = new keyword();
		keyword k2 = new keyword();
		keyword k3= new keyword();
		
		k.setval();
		k2.setval();
		k3.setval();
		k.printval();
		k2.printval();
		k3.printval();
	}
}
*/

//static method 

/*
 * diffrence between normal block and static block
 * 
 * normal block will get called only and only the object of that class is created.
 * 
 * but static block is called with out creating object using method name /class name we can create static block.
 * 
 */

/*
package javapackage.keyword;

class keyword{
	static int a = 10;
	static int b;
	{
		System.out.println("block 2");

	}	
	static void meth(int c)
	{
		System.out.println("c" +c);
		System.out.println("a" +a);
		System.out.println("b" +b);

	}
	static 
	{
		System.out.println("block initialized");
	}
	
	{
		System.out.println("block initialized");
		System.out.println(b=a*4);
	}
	
	public static void main(String[] args) {
		keyword k1 =new keyword();
		meth(40);
	}
	
}
*/

//this keyword

/*
 * this keyword is belong to current class only.
 */

/*
package javapackage.keyword;

class student{
	
	int rollno;
	String name;
	
	student()
	{
		System.out.println("default constructor");
	}
	student(int rollno,String name)
	{
		//this();
		//this.rollno = rollno;
		//this.name = name;
		System.out.println("rollno is\t"+rollno);
		System.out.println("name is\t"+name);
	}
}
class keyword{
	public static void main(String[] args) {
		student s = new student(1,"manan");
	}
}
	
*/


//final keyword

/*
 * 
 * if declare variable as final then need to compoulsory assign and u cannot change the value.
 * if declare method as final then method cannot be overriden.
 * if declare class as final then you cannot inherit that class.
 * 
 */


package javapackage.keyword;

class student{
	
}





















































