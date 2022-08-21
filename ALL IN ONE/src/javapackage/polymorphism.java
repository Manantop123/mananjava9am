package javapackage;


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




