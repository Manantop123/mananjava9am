//basic programme to print hello world using method
/*
package javapackage;

import java.util.Scanner;

class testnewon{
		Scanner sc = new Scanner(System.in);
		String a;
		
		void getval(){
		System.out.println("Enter word");
		a = sc.nextLine();
		}
		
		void showval(){
			System.out.println(a);
		}
}	
public class practice{
	public static void main(String[] args) {
		testnewon t = new testnewon();
		t.getval();
		t.showval();
	}
}
*/


//1--JAVA PROGRAMME TO CALCULATE AREA OF CIRCLE
/*
package javapackage;

import java.util.*;

//using static method

class practice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		double r = sc.nextInt();
		double area = (r*r)*3.14;
		System.out.println("circle is "+ area);
	}
}
*/
//2--using inheritance
/*
package javapackage;

import java.util.*;

class areacalc{
	double area ;
	
	void circle(double r) 
	{
		area = (r*r)*3.14;
	}
}
class practice  extends areacalc{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		practice pc = new practice();
		System.out.println("enter radius");
		double rad = sc.nextDouble();
		pc.circle(rad);

		
		System.out.println("circle is "+pc.area);
	}
	
}
*/
// using constructor






