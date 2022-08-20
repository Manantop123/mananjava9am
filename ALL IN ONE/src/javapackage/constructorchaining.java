package javapackage;

//package com.OOP;

class A2{	
	
	A2()
	{
		System.out.println("A2's Constructor called");
	}
	
	void show()
	{
		System.out.println("Show from A");
	}
}

class B2 extends A2{
	
	
	
	B2()
	{
		System.out.println("B2's Constructor called");
	}
	
	void show()
	{
		//super.show();
		System.out.println("Show from B");
	}
}

class C2 extends B2{
		
	C2()
	{
		System.out.println("C2's Consrtuctor Called");
	}
	
	void show()
	{
		//super.show();
		System.out.println("Show from C");
	}
}


public class constructorchaining {
	public static void main(String[] args) {
		C2 c = new C2();
		c.show();			
	}
}
