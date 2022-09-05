package topic;

import java.util.Scanner;

public class exception {
	public static void demo()
	{
		int a;
		Scanner sc = new Scanner(System.in);
		try 
		{
		System.out.println("enter value of a is");
		a = sc.nextInt();
		if(a>0)
		{
			System.out.println("square of a is"+(a*a));
		}
		else
		{
			throw new Exception("please enetr +value");
		}
		}
		catch(Exception e)
		{
			System.out.println("exception caught");
			demo();
		}
		finally
		{
			System.out.println("bloack is execute");
		}
		
	}
	public static void main(String[] args) {
		demo();
	}
}
