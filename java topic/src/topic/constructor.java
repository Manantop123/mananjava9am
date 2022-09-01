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
































