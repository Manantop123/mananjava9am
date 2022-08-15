package javapackage;

import java.text.SimpleDateFormat;	
import java.util.*;
import java.io.*;

/*
public class module {


// question - 1
//Write a Java program to Take three numbers from the user and print the greatest number.
// using nested if condition
 * 	
public class programme{
	public static void main(String[] args) {
		
		
		int a,b,c,i=1;
		Scanner sc = new Scanner(System.in);

		
			System.out.println("Enter A value");
			a = sc.nextInt();
			System.out.println("Enter B value");
			b = sc.nextInt();
			System.out.println("Enter C value");
			c = sc.nextInt();
			
			if(a>b) 
			{
				if(a>c)
				{
					System.out.println("a is maximum");
				}
				else
				{
					System.out.println("c is maximum");
				}
			}else {
				if(b>c)
				{
					System.out.println("b is maximum");
				}	
				else
				{
				System.out.println("c is maximum");
				}
			}
		}
}

*/
//using if else statement
/*
public class programme{
	public static void main(String[] args) {
		
		
		int a,b,c,i=1;
		Scanner sc = new Scanner(System.in);

		
			System.out.println("Enter A value");
			a = sc.nextInt();
			System.out.println("Enter B value");
			b = sc.nextInt();
			System.out.println("Enter C value");
			c = sc.nextInt();

			if(a>b &&  a> c) 
				System.out.println("a is max");
			else if(b>c && b>a)
				System.out.println("b is max");
			else
				System.out.println("c is maximum");
	}
}
*/





//	Question - 2
/*
public class module{
//Write a Java program that takes the user to provide a single character
//from the alphabet. Print Vowel or Consonant, depending on the user
//input. If the user input is not a letter (between a and z or A and Z), or is a
//string of length > 1, print an error message.	

// using  if condition

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value between a to z");
		
		char ch =((sc.next()).charAt(0));
		
		
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
//Question - 6
//Write a program in Java to display the pattern like right angle triangle
//with a number.
//1
//12
//123
//1234
//12345

/*
public class module{
	public static void main(String[] args) {
		int number;
		for(int i=1; i<=5;  i++) {
			number =1;
			for(int j=1;j<=i;j++) {
				System.out.print(number + "");
				number++;
			}
			System.out.println("");
		}
	}
}
*/
/*
//Question - 7
//Write a program in Java to make such a pattern like right angle triangle
//with number increased by 1 The pattern like:
//1
//2 3
//4 5 6
//7 8 9 10

public class module{
	public static void main(String[] args) {
		int i,j,k=1;
		for(i=0; i<4;i++) {
			for(j=0; j<=i; j++) {
				System.out.print(k++ +"");
			}
			System.out.println();
		}
	}
}
*/

//Question - 8
//Write a Java program that reads a positive integer and count the number 
//of digits the number.
//using while loop
/*
public class module{
	public static void main(String[] args) {
		int num = 12345678;
		int count = 0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
*/
/*
//using length method
public class module{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("enter number ");
		number = sc.nextInt();
		
		int count = (number + "").length();
		System.out.println(count);
		if(number>0) 
		{
			System.out.println("positive");
		}
		else if(number<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("zero");
		}
	}
}
*/

//Question - 9
//Write a Java program to count the letters, spaces, numbers and other
//characters of an input string
/*
public class module{
	public static void main(String[] args) {
		String a = "the best of world";
		int count = 0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				count++;
			}
			System.out.println("total number of charcter string"+count);
		}
	}
}
*/

//Question - 10
//Write a Java program to print the ASCII value of a given character.
// find single charcter value
/*
public class module{
	public static void main(String[] args) {
		System.out.println("enter character");
		Scanner sc = new Scanner(System.in);
		char chr = sc.next().charAt(0);
		int asciivalue = chr;
		System.out.println("ascii value of "+chr + "is"+asciivalue);
	}
}
*/

//find value between A to Z of ascii
/*
public class module{
	public static void main(String[] args) {
		for(int i = 65; i<=90; i++) {
			System.out.println("the ascii value of "+(char)i+" "+i);
		}
	}
}  
*/

//	Question - 11	Not solved 

//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//Input number: 5
//5 + 55 + 555


//Question - 12
//Write a Java program to display the system time.
/*
public class module{
	public static void main(String[] args) {
		Date current_Date = new Date();
		System.out.println(current_Date);
	}
}
*/
// display time with diffrent format

/*
public class module{
	public static void main(String[] args) {
		
		//SimpleDateFormat class initialize  with object
		//z is use for print time zone
		SimpleDateFormat formatdate = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss z");
		
		Date date = new Date();
		//date class initialize
		
		
		formatdate.setTimeZone(TimeZone.getTimeZone("IST"));
		//converting format the date as IST
		
		  
		System.out.println(formatdate.format(date));
		//print formatted date and time
	}
}

*/

//Write a Java program to print numbers between 1 to 100 which are
//divisible by 3, 5 and by both.
/*
public class module{
 	public static void main(String[] args) {
		System.out.println("\ndevided by 3");
		for(int i=0; i<100; i++) 
		{
			if(i%3==0)
			System.out.print(i+",");
		}
		System.out.println("\ndevided by 5");
		for(int i =0; i<100; i++)
		{
			if(i%5==0)
			System.out.print(i+",");
		}
		System.out.println("\ndevided by 3 and 5");
		for(int i=0; i<100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+",");
			}
		}
 	}
}

*/



















































































