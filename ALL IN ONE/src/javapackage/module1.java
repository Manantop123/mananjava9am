package javapackage;

import java.sql.Date;
import java.util.Scanner;
import java.util.*;
//Write a Java program to Take three numbers from the user and print the
//greatest number.
//using if condition
/*
public class module1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		System.out.println("Enter third number");
		c = sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("a is larger");
			}
			else {
				System.out.println("c is larger");
			}
		}
		else {
		if(b>c) {
			System.out.println("b is larger");
		}
		else {
			System.out.println("c is larger");
		}
		}
	}
}

*/

//using elseif condition
/*
public class module1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		System.out.println("Enter third number");
		c = sc.nextInt();
		if((a>b) && (a>c))
			System.out.println("a is greater");
		else if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
 	}
}
*/


//Write a Java program that takes the user to provide a single character
//from the alphabet. Print Vowel or Consonant, depending on the user
//input. If the user input is not a letter (between a and z or A and Z), or is a
//string of length > 1, print an error message.

//using if condition
/*
public class module1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("enter character");
		ch = sc.next().charAt(0);
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o'||ch =='u' || ch == 'A' || ch=='E' || ch=='I' || ch=='O'||ch =='U')
			System.out.println("vowel");
		else if(ch=='b' || ch=='c'|| ch=='d'|| ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z')
			System.out.println("constant");
		else
			System.out.println("error");
	}
}
*/

//using switch case
/*
public class module1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("enter character");
		ch = sc.next().charAt(0);
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u' :
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U' :
			{
				System.out.println("vowel");
				break;
			}
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
			{
				System.out.println("constant");
				break;
			}
			default:
				System.out.println("error");
		}
	}
}
*/

//Write a Java program that takes a year from user and print whether that
//year is a leap year or not. B19. Write a program in Java to display the first
//10 natural numbers using while loop.

//using if condition
//using for loop
/*
public class module1{
	public static void main(String[] args) {
		int i,n=2012;
		for(i=1956; i<=n; i++){
		if((i%4==0) || (i%400 ==0) || (i%100 == 0)) {
			System.out.println("leap year"+i);
		}
		else {
			System.out.println("not leap year"+i);
		}
	  }
	}
}
*/



//B19. Write a program in Java to display the first
//10 natural numbers using while loop
/*
public class module1{
	public static void main(String[] args) {
		int i=1,n=10;
		while(i<=n) {
			System.out.println("nutral no is\t"+i);
			i++;
		}
	}
}
*/

// Write a program in Java to input 5 numbers from keyboard and find their
//sum and average using for loop

/*
public class module1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,sum=0,avg;
		for(i=1; i<=5;i++) {
			System.out.println("enter 5 number is"+ i);
			sum=sum+i;
		}
		System.out.println("5 no sum is"+sum);
		avg = sum/5;
		System.out.println("avg is "+avg);
	}
}

*/

/*
 *  Write a program in Java to display the pattern like right angle triangle
with a number.
1
12
123
1234
12345 
 */
/*
public class module1{
	public static void main(String[] args){
		int number;
		for (int i= 1; i<=5; i++) {
			number=1;
			for(int j=1; j<=i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println("");
		}
	}
}
*/

//Write a program in Java to make such a pattern like right angle triangle
//with number increased by 1 The pattern like:
//1
//2 3
//4 5 6
//7 8 9 10


/*
public class module1{
	public static void main(String[] args) {
		int number = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				number++;
				System.out.print(number+" ");
			}
			System.out.println(" ");
		}
	}
}
*/



//Write a Java program that reads a positive integer and count the number
//of digits the number.


//using length method

/*
public class module1{
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int number;
		//System.out.println("enter number ");
		//number = sc.nextInt();
		
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
//using length() function

/*
public class module1{
	public static void main(String[] args) {
		String  name="manan soni";
		int count = (name + "").length();
		System.out.println(count);
	}
}
*/





////Write a Java program to count the letters, spaces, numbers and other
//characters of an input string.



//	NOt SOLVED


//Write a Java program to print the ASCII value of a given character.
/*
public class module1{
	public static void main(String[] args) {
		for(int i=65 ; i<=95; i++) {
			System.out.println("the anscii value is "+(char)i+" "+i);
		}
	}
}
*/


//Write a Java program that accepts an integer (n) and computes the value
//of n+nn+nnn.
//Input number: 5
//5 + 55 + 555



// NOT SOLVED


//Write a Java program to display the system time.
/*
public class module1{
	public static void main(String[] args) {
		//Date d = new Date();
		System.out.println(java.time.LocalDate.now());
	}
}
*/

//Write a Java program to print numbers between 1 to 100 which are
//divisible by 3, 5 and by both.



public class module1{
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

























































































































































































































//Write a Java program that takes the user to provide a single character
//from the alphabet. Print Vowel or Consonant, depending on the user
//input. If the user input is not a letter (between a and z or A and Z), or is a
//string of length > 1, print an error message.

// using if condition


































