/*
 * 	java dat type
 * 
 * 	datatype 	size
 * 	
 * 	short		1byte
 *  char		1byte
 *  byte		1byte
 *  int			4 byte	Integer
 *  float		4 byte	Float
 *  long		8 byte	Byte
 *  double		8 byte	Byte
 *  boolean		1 bit	True/False Boolean
 *  
 *  variable:
 *  
 *  	variable is name at memory location. which can store value of particular type.
 *  
 *  		Rules:
 *  			1)variable name should not start with digit.
 *  			2)are case sensitive.
 *  			3)no special symbole are allowed. like $,@
 *  			4)follw ascii.
 *  
 *  		american standard code for information interchange.
 */

package COREJAVA;

import java.util.Scanner;

public class BASICCODE {
	public static void main(String[] args) {
		System.out.println("java programming\n");
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println(" enter value of a ");
		a = sc.nextInt();
		System.out.println(" enter value of b ");
		b=sc.nextInt();
		
		System.out.println("addition of a and b is "+ (a+b));
		System.out.println("division of a nd b is " + (a/(float)b));
		System.out.println("multiplication of and b is "+(a*b));
		System.out.println("substraction of a and b is" + (a-b));
	}
}
