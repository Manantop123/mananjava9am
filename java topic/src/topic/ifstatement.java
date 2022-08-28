/* programme - 1:-- maximum number
package topic;

import java.util.Scanner;

public class ifstatement {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		System.out.println("enter value of c");
		c=sc.nextInt();
		if (a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
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

// programme - 2:-- leap year
/*
package topic;

import java.util.*;

public class ifstatement{
	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter charcter");
		a=sc.next().charAt(0);
		try {
		if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')||(a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U'))
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("not vowel");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
*/
//programme - 3:-- blood donation eligibility
/*
package topic;

import java.util.*;

public class ifstatement{
	public static void main(String[] args) {
		int age,weight;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		age = sc.nextInt();
		System.out.println("enter weight");
		weight = sc.nextInt();
		
		if((age>=18) && (age<=50))
		{
			if((weight>60) && (weight <=100))
			{
				System.out.println("you are eleigible");
			}
			else
			{
				System.out.println("you are not eligible");
			}
		}
		else
		{
			System.out.println("you are not eligible");
		}
		}
}
*/
// if else if laddar statment 

package topic;

import java.util.*;

public class ifstatement{
	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks");
		marks = sc.nextInt();
		
		if((marks>35)&&(marks<=40))
		{
			System.out.println("pass class");
		}
		else if((marks>40)&&(marks<=75))
		{
			System.out.println("second class");
		}
		else if((marks>75) &&(marks<=85))
		{
			System.out.println("firstclass");
		}
		else
		{
			System.out.println("distinction");
		}
	}
}















































