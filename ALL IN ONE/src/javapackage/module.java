package javapackage;

import java.util.*;
/*
public class module {


// question - 1
//Write a Java program to Take three numbers from the user and print the greatest number.
	
	public static void main(String[] args) {
	
	int a,b,c;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter valuee of a");
	a = sc.nextInt();
	System.out.println("Enter value of b");
	b = sc.nextInt();
	System.out.println("Enter value of c");
	c = sc.nextInt();
	
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("a is maximum value");
		}
		else
		{
			System.out.println("c is maximum");
		}
		if(b>c)
		{
			System.out.println("b is maximum");
		}	
	}
	else {
		System.out.println("b is maximum");
	}
	}
	
}
*/
/*	Question - 2
public class module{
//Write a Java program that takes the user to provide a single character
//from the alphabet. Print Vowel or Consonant, depending on the user
//input. If the user input is not a letter (between a and z or A and Z), or is a
//string of length > 1, print an error message.	

// using  if condition

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value between a to z");
		
		char ch =((sc.nextLine()).charAt(0));
		
		
		if(ch == 'a' || ch == 'e' || ch == 'i'|| ch=='o' || ch=='u' || ch == 'A' || ch == 'E' || ch == 'I'|| ch=='O' || ch=='U') 
		{
			System.out.println("vowel");
		}
		if(ch=='b' || ch=='c'|| ch=='d'|| ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z')	
		{
			System.out.println("constant");
		}
		else
		{
			System.out.println("an error message");
		}
	}	
}

*/	


// using switch statment
/*
public class module{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		char ch = ((sc.nextLine()).charAt(0));
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("vowel");
				break;
			case 'B':
			case 'C':
			case 'D':
			case 'F':
			case 'G':
			case 'H':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				System.out.println("not vowel");
				break;
			default:
				System.out.println("error");
		}
	}
}
*/

// Question - 3
//Write a Java program that takes a year from user and print whether that
//year is a leap year or not.  
/*
public class module{
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		year =sc.nextInt();
		if(((year%4==0) && (year%100!=0 )) || (year %400==0)){
			System.out.println("year is leap year");
		}
		else {
			System.out.println("year is not leap year");
		}
	}
}
*/

//Question - 4
//Write a program in Java to display the first 10 natural numbers using while loop.
/*
public class module{
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10;i++) {
			//sum=sum+i;
			System.out.println(i);
		}
	}
}
*/
//Question - 5
//Write a program in Java to input 5 numbers from keyboard and find their
//sum and average using for loop.
// for loop
/*
public class module{
	public static void main(String[] args) {
		int i,sum=1;
		float avg;
		System.out.println("enter all element");
		for(i=0;i<5;i++) 
		{
			sum=sum+i;
		}
		System.out.println("sum:"+sum);
		avg = sum/5;
		System.out.println("avg:"+avg);
		
	}
}
*/
//using while loop
/*
public class module{
	public static void main(String[] args) {
		int i=1,sum=1;
		float avg;
		System.out.println("all element");
		while(i<5) {
			sum=sum+i;
			i++;
		}
		System.out.println("sum"+sum);
		avg = sum/5;
		System.out.println("avg"+avg);
	}
}
*/


























