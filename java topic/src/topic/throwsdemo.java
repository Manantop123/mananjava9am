package topic;

import java.util.Scanner;

/*
 * 	it is keyword.
 * 	this is handle at compile time.
 * 	not work with try/catch block.
 *  it work with methid signature.
 *  	public void meth() throws Exception
 * 
 */

public class throwsdemo {

	public static void demo() throws Exception
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		a = sc.nextInt();
		try
		{
		if(a>0) 
		{
		System.out.println("value of a is "+(a*a));
		}
		else
		{
			throw new Exception("enter + value");		
		}
		}
		catch(Exception E)
		{
			System.out.println("exception caught");
			demo();
		}
	}


	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
