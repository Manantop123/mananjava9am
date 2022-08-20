/*
 * contructor :----
 * 
 * 	1) same name as class name.
 *  2) no return type.
 *  3) it is special member function who's task to initialize variable value
 * 
 * 
 * There are three types of constructor
 * 	--> default constructor
 *	--> parameterised constructor
 *  --> copy constructor
 */ 


//example of default constructor

package javapackage;
/*
	

public class constructor {
	
		
	double width,height,depth;
	
	constructor()
	{
		width = 50;
		depth = 40;
		height = 10;
		System.out.println("default constructor called");
	}
	void volume() {
		System.out.println("volume of box is"+(width*depth*height));
	}
	public static void main(String[] args) {
		constructor c1 = new constructor();
		c1.volume();
	}
	}
*/


//example of parametersised constructor
/*
public class constructor{
	
	double height,width,depth;
	
	constructor()
	{
		height = 30;
		depth = 20;
		width = 10;
	System.out.println("default constructor");
	}
	constructor(double  h, double  w, double  d)
	{
		System.out.println("parameter constructor");
		height = h;
		width = w;
		depth = d;		
	}
	void volume() {
		System.out.println("box value is"+(height*width*depth));
	}
	public static void main(String[] args) {
		constructor c1 = new constructor();
		c1.volume();
		constructor c2 = new constructor(10,20,30);
		c2.volume();
	}
}
*/
//copy constructor

public class constructor{
	
	double height,width,depth;
	
	constructor(){
		System.out.println("default constructor");
		height = 20;
		width = 10;
		depth = 30;
	}
	constructor(double h, double w, double d){
		System.out.println("this is parameterised constructor");
		height = h;
		width = w;
		depth = d;
	}
	constructor(){
		
	}
	void volume() {
		System.out.println("box value is"+(height*width*depth));
	}
	public static void main(String[] args) {
		constructor c1 = new constructor();
		c1.volume();
		constructor c2 = new constructor(50,20,30);
		c2.volume();
	}
}






















