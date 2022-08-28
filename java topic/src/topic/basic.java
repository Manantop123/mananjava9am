/*
*	java - java has three edition 
*
*	i) se - stanadard edition - stand alone application
*	ii) ee - enterprise edittion - provide API and runtime environment
*	iii) me - micro edition - provide API and small foot-print virtual machine for running 
*			java programming language on small device.
*	
*	SE :-
*
*	//se edition is used to create  stand alone application.
*	
*	//stand alone application means computer programme that can work offline. does not neccessary require to network connection.
*	
*	//example of stand alone application is like noteped,word,calculator.
*	
*	//java se edition provide following packages
*
*		(i)	java.lang :-- this package provide language basics.
*		(ii)java.util :-- package provide classes and interfaces related to collection framework,event,data structure.
*		(iii)java.io :-- package provide classes and interface for file operation and other input or output operation.
*		(iv)java.math :-- package provide classes and interface for mathematics operation.
*		(v)	java.sql :-- package provide classes and interface for accessing/manipulating the data stored in database.
*		(vii)java.beans :-- package provide classes and interface for java bean component.
*	
*	EE:- 
*
*	//The Java EE platform provides an API and runtime environment for developing and running large-scale, 
*		multi-tiered, scalable, reliable, and secure network applications
*	
*	//API like servlets, websockets, javaserverfaces, unified expression language.
*
*	ME :-
*		
*	//provide API and small foot-print virtual machine for running 
*			java programming language on small device
*	
*		
*	There are two types of classes :---
*										(i) public
*										(ii) private
*
*	public class :-- 
*			
*		--->	all the class member declare under public class will be avalbale to everyone.
*		--->	the public member of class access from anywhere in the programme using direct member access operator. 
*	
*		package topic;

class normal{
	int a=30;
	
	void show()
	{
		System.out.println("value of a is "+a);
	}
}
	public class basic
	{
	public static void main(String[] args) {
		normal b = new normal();
		b.show();
	}
}

*		
*
*	private class :--
*
*		--->	class declare under private can be accessed only by function inside the class.  		
*		--->    only member function or friend function are allowed to access the private data member of a class.
*
*/

// example of public class
//package topic;
//
//class normal{
//	int a=30;
//	
//	void show()
//	{
//		System.out.println("value of a is "+a);
//	}
//}
//	public class basic
//	{
//	public static void main(String[] args) {
//		normal b = new normal();
//		b.show();
//	}
//}


//example of private class

//package topic;
//
//public class jack{
//	int b=10;
//
//	private void show()
//	{
//		System.out.println("value of a is "+ b);
//	}
//}
//public class basic{
//	public static void main(String[] args) {
//		jack n1 = new jack();
//		n1.show();
//
//	}
//}

//example of private class

//package topic;
//public class basic{
//	private int a = 20;
//	public static void main(String[] args) {
//		basic r = new basic();
//		System.out.println("value of a is"+r.a);
//		System.out.println("value of a is "+r.a);
//		
//	}
//}







































