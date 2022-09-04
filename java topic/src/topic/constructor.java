package topic;

import java.util.Scanner;

// there are 3 types of constructor.

//default constructor
/*
public class constructor {
	
		int no1,no2,no3;
		
		constructor()
		{
			no1 = 10;
			no2=3;
			no3=5;
			System.out.println("default constructor");
		}
		void volume()
		{
			System.out.println("volume is  "+   (no1*no2*no3));
		}
		public static void main(String[] args) {
			constructor c1 = new constructor();
			c1.volume();

		}

}
*/

//parameterized constructor
/*
public class constructor{
	
	int height,width,depth;
	constructor()
	{
		height = 10;
		width =4;
		depth =5;
		System.out.println("default constructor");
	}
	constructor(int h, int w, int d)
	{
		System.out.println("parameterized constructor");
		height = h;
		width = w;
		depth = d;
	}
	void volume()
	{
		System.out.println("volume is"+(height*width*depth));
	}
	public static void main(String[] args) {
		constructor c1 = new constructor();
		c1.volume();
		constructor c2 = new constructor(2,3,4);
		c2.volume();
	}
}
*/
//parametrized constructor

/*
public class constructor{
	int no1,no2;
	constructor()
	{
		System.out.println("default constructor");
		no1 = 6;
		no2=3;
	}
	constructor(int a,int b)
	{
		System.out.println("parametrized constructor");
		no1 = a;
		no2 = b;
	}
	void volume()
	{
		System.out.println("volume is"+(no1/no2));
	}
	public static void main(String[] args) {
		try {
		constructor c1 = new constructor();
		c1.volume();
		constructor c2 = new constructor(10,2);
		c2.volume();
		}
		catch(Exception e)
		{
			System.out.println("got some mistake");
		}
}
}
*/

//copy constructor

public class constructor{
	double hight,width,depth;
	
	constructor()
	{
		System.out.println("default constructor");
		hight = 2;
		depth = 3;
		width = 5;
	}
	constructor(double h,double w,double d)
	{
		System.out.println("parametrized constructor");
		hight = h;
		width = w;
		depth = d;
	}
	constructor(constructor c1)
	{
		System.out.println("copy constructor");
		width = c1.width;
		hight = c1.hight;
		depth = c1.depth;
	}
	
		void volume()
	{
		System.out.println((hight*width*depth));
	}
	
	
//	void volume()
//	{
//		System.out.println((hight*width*depth));
//	}
	public static void main(String[] args) {
		constructor c1 = new constructor();
		c1.volume();
		constructor c2 = new constructor(2,3,5);
		c2.volume();
		constructor c3 = new constructor(c2);
		c3.volume();
	}
	
}














































































