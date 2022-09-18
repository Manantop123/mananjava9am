package COREJAVA;

import java.util.Scanner;

/*
public class CALCULATOR {
	public static void main(String[] args) {
		//using switch statment
		Scanner sc = new Scanner(System.in);
		char operator;
		double a,b,ans;
		System.out.println(" welcome ");

		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println(a);
		System.out.println("enter value of b");
		b=sc.nextInt();
		System.out.println(b);

		System.out.println("enter any symbol +,-,/,* ");
		operator = sc.next().charAt(0);
		

		
		switch(operator)
		{
		case  '+':
				ans = a+b;
				System.out.println("addition of a nd b is"+ans);
				break;
		case '-' :
				System.out.println("substaaction of a nd b is"+(b-a));
				break;
		case '*':
			System.out.println("multiplication of a nd b is"+(a*b));
			break;
		case '/':
			System.out.println("divison of a nd b is"+(a/b));
			break;
		default:
			System.out.println("enter correct symbol");
			
		}
		
	}
}
*/


// using if statement

public class CALCULATOR
{
	public static void main(String[] args) {
		char operator;
		double a,b,ans;
		System.out.println("welcome");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		a = sc.nextDouble();
		System.out.println("enter value of b");
		b = sc.nextDouble();
		System.out.println("enter symbol +,-,/,*");
		
		operator = sc.next().charAt(0);
		
		if(operator == '+')
		{
			ans = a+b;
			System.out.println("addition"+ans);
		}
		else if(operator == '-')
		{
			ans = b -a;
			System.out.println("substraction"+ans);
		}
		else if(operator == '*')
		{
			ans = a*b;
			System.out.println("multiplication"+ans);
		}
		else if(operator ==  '/')
		{
			ans = a/b;
			System.out.println("divison "+ans);
		}
		else
		{
			System.out.println("wrong statement");
		}
		
	}
}