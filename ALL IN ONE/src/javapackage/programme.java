// basic 1st java programmes

package javapackage;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;


/*
public class programme {
		public static void main(String[] args) {
			
			System.out.print("hello world");
			
		}
}
*/

/*
 * theorey

package javapackage; :- java package
*/
/*
in java main method class is always public
*/
/*
in java main mehod is always static bcz compiler can  call its without creating object
*/
/*
 	main() is starting from where compiler start program execution
 */


//theorey data type
/*
datatype 				class				size

byte					Byte				1	byte
char					Character			1	"
short					Short				1	"
int						Integer				4	"	
float					Float				4	"
long					Long				8	"
double 					Double				8	"
boolean					Boolean				1 bit

*/



//theorey
/*
 * variable is name at memory location used to store value of particular type.
 * 
 * rules :- 
 * 1)first character should not be digit.
 * 2)no special symbol allowed. except _ and $
 * 3) it is case-sensitive.
 * 4)follow ascii value. american standard code for information interchange.
 */


//2nd java basic caluclator programme

/*
public class programme{
	
	public static void main(String[] args) {
		System.out.println("addition of a and b");
		System.out.println("division of a and b");
		System.out.println("substract of a and b");
		System.out.println("multiplication of a and b");
		
		int a =10 , b=5;
		
		System.out.println("\naddition of a nd b is "+(a+b));
		System.out.println("\ndivision of a nd b is "+(a/b));
		System.out.println("\nsubstract of a nd b is "+(a-b));
		System.out.println("\nmultiplication of a nd b is "+(a*b));
		
		
	}
}
*/


/*theoey
 * in java use scanner classs from java.util package is useful for import value from user.
 * 
 * syntax for scanner is :- 
 * 	
 * 	Scanner Sc = new Scanner(System.in)
 * 
 * 	Scanner is class, Sc is object , new is keyword , Scanner is class,
 *  System.in is keyword which is connected to keyboard input stream.
 * 
 * in java every value getting from user is in string so use nextint funtion convert string to int.
 * 
 */


//3rd java prograame for user input
/*
public class programme{
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter a value");
		a = Sc.nextInt();
		System.out.println("Enter b value");
		b = Sc.nextInt();
		System.out.println("addition of a nd b is\n"+(a+b));
		System.out.println("division of a nd b is\n"+(a/b));
		System.out.println("multiplication of a nd b is\n"+(a*b));
		System.out.println("substraction of a nd b is\n"+(a-b));
	}
}
*/

//basic of method progarame
/*
public class programme{
	int a,b;
	Scanner Sc = new Scanner(System.in);
	void getval()
	{
		System.out.println("enter a value");
		a = Sc.nextInt();
		System.out.println("\nenter b value");
		b =Sc.nextInt();
	}
	void showval()
	{
		System.out.println("value of a"+a);
		System.out.println("value of b"+b);
	}
	public static void main(String[] args)
	{
		
		programme P = new programme();
		P.getval();
		P.showval();
	}
}

/*theorey
* if and else statemet doesnot contain semicolon
* can define variable name = object.method
*/

// basic programme of ef and else statement
/*
public class programme{
	public static void main(String args[])
	{
	
		Scanner Sc = new Scanner(System.in);
		System.out.print("enter a");
		int a = Sc.nextInt();
		
		if (a>0)
		{
			System.out.print("positive");
		}
		else
		{
			System.out.print("negative");
		}
	}
}
*/


//basic programme of nested if/else statment
/*
public class programme{
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Entet value of a");
		int a = Sc.nextInt();
		System.out.println("enter value of b");
		int b = Sc.nextInt();
		System.out.println("enter value of c");
		int c = Sc.nextInt();
		
		// find highest character 
		
		if(a>b) 
		{
			
			if(a>c) 
			{
				System.out.println("a is greater");
			}
			else 
			{
				
				System.out.println("c is gretar than");
			}
		}
		else 
		{
				
			if(b>c) 
			{
					System.out.println("b is greater");
			}
				else
				{
					System.out.println("c is greater");
				}
			
				
		}

	}
}
*/

// basic programe of laddar if/else


/*
public class programme{
	Scanner Sc = new Scanner(System.in);
	int rollno,name,p,c,m,tot,per;
	void getval() {
		
		

		System.out.println("enter rollno");
		int rollno = Sc.nextInt();
		System.out.println("enter name");
	    String name = Sc.next();
	    System.out.println("enter physics marks\n");
	    int p = Sc.nextInt();
	    System.out.println("enter chemestry marks\n");
	    int c = Sc.nextInt();
	    System.out.println("enter maths marks\n");
	    int m = Sc.nextInt();
	    int tot = p+m+c;
	    System.out.println("total is \n"+tot);
	    float per = (float)tot/3;
	    System.out.println("per is \n"+per);
		 
	    System.out.println("rollno is " + rollno);
		 System.out.println("name  is "+ name);
		 System.out.println("tot  is "+ tot);
		 System.out.println("per  is "+ per);
		 
		 if(per>75)
		 {
			 System.out.println("distiction");
		 }
		 else if(per>60) 
		 {
			System.out.println("first class"); 
		 } 
		 else if(per>45)
		 {
			 System.out.println("second class");
		 }
		 else if(per>40)
		 {
			 System.out.println("pass class");
		 }
		 else
		 {
			System.out.println("fail"); 
		 }
	}
		 public static void main(String[] args) 
		 {
			 programme p = new programme();
			 p.getval();
		 }
}
/*
* theroey
* loop:- repeating same task again and again is called loop.
* there are 3 types of loop
* 1)while loop
* 2)do-while loop
* 3)for loop
* 
* 1) while loop:--
* 
* 		while(condition)
* 		{
* 			//statement
* 			incr/decr
* 		}
* 
* --> it is called entry control loop
why bcz it check condition first then statemnt 
* --> no semicolon after condition
* 
* 2) do-while loop:--
* 
* do{
* 	statement;
* 	incr/decr;
* }
* while(condition);
* 
* --> it is called exit control loop.
* bcz it condition check afterwards.
* -->it execute blocks atleast once , even if the condition is false.
* --> semi-colan after condition
* 
* 3)for loop:--
*/


//basic programme of for loop
/*
public class programme{
	public static void main(String[] args) {
		int i;
		for(i=1; i<=10;i++) {
			System.out.println(i);
		}
	}
}
*/

//basic programme of while loop

/*
public class programme{
	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
}
*/

//basic programme of do-while loop
/*
public class programme{
	
	public static void main(String[] args) {
		int i=0;
		do 
		{
			i++;
			System.out.println(i);
	    }while(i<10);
	}
}

*/
// basic pattern programme like * ** *** **** *****
/*
public class programme{
	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.println("*");
			}
			System.out.println("");
		}
				
	}
}
*/

//basic second pattern programme like add * from last and increase by 1 by 1
/*
public class programme{
	public static void main(String args[]) {
		for(int i=0; i<10 ; i++) 
		{
			for(int sp = 0;sp<10-i;sp++)
			{
				System.out.println(sp);
			}
			for(int j=0; j<=i;j++)
			{
				System.out.println("*");
			}
			System.out.println("");
		}
	}
}
*/
//basic third pattern programme 
/*
public class programme{
	public static void main(String[] args)
	{
		for (int i=1; i<5; i++)
		{
			for(int sp=0; sp<=5-i; sp++)
			{
				System.out.print(" ");
			}
		for (int j=i; j<=i; j++)
		{
			System.out.println("*");
		}
		System.out.println();
		}
	}
}

*/

//basic programme

/*
public class programme{
	public static void main(String[] args)
	{
		for(int i=0; i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/


/*
public class programme{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			System.out.print("*");
		}
	}
}
*/


//basic programme of while loop
/*
public class programme{
	public static void main(String[] args) {
		
		//initialize expresion
		int i=0;
		
		//test expresiion
		while(i<6) {
			System.out.println("hello world");
			
			//update expresion
			i++;
		}
	}
}
*/

//find numbers from 1 to 10
/*
public class programme{
	
	public static void main(String[] args) {
		
		int x =1, sum = 0;
		//exit when x become greater than 4
		
		while(x<=10) {
			//summing up x
			
			sum=sum+x;
			//increment the value of x
			x++;
			
			System.out.println("summation"+sum);

		}

	}
}
*/
//basic of pattern program like 1* 12** 123*** 1234****
/*
public class programme{
	public static void main(String[] args) {
			for(int i =1; i<=5; i++) {
				System.out.print("");
				for(int sp=1;sp<=i;sp++) {
					System.out.println("");
			
				}
				for(int j=1;j<=i; j++) {
					System.out.print("*");
					}
			}
		}
	}
*/

/*
public class programme{
	public static void main(String[] args) {
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/

//basic for loop pattern programme 
/*
public class programme{
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
*/

//basic while loop 
/*
public class programme{
	public static void main(String[] args) {
		int i=0,j=0;
		while(i<=4) {
			i++;
			while(j<=i) {
				j++;
				System.out.println("*");
				
			}
			System.out.println("");
		}
	}
}
*/
//basic switch statment

public class programme{
	public static void main(String[] args) {
		
		char operator;
		int ans,no1,no2;
		
		//create new object of saneer class
		Scanner sc = new Scanner(System.in);
		
		//ask user to enter operator
		System.out.println("choose an operator +,-,/,*");
		operator = sc.next().charAt(0);
		
		//ask user to add no1
		System.out.println("enter value of no1");
		no1 = sc.nextInt();
		//ask user to add no2
		System.out.println("enter value of no2");
		no2 = sc.nextInt();
	
		switch(operator) {
			case '+':
				ans=no1+no2;
				System.out.println("no1 ="+no1+"\tno2 ="+no2+"\tans ="+(no1+no2));
				break;
			case '-':
				ans=no1-no2;
				System.out.println("no1 ="+no1+"\tno2 ="+no2+"\tans ="+(no1-no2));
				break;
			case '/':
				ans=no1/no2;
				System.out.println("no1 ="+no1+"\tno2 ="+no2+"\tans ="+(no1/no2));
				break;
			case '*':
				ans=no1*no2;
				System.out.println("no1 ="+no1+"\tno2 ="+no2+"\tans ="+(no1*no2));
				break;
				
			default:
				
				System.out.println("invalid operator");
				break;
				
		}
	}
}






































