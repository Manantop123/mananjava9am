/*
 * there are three types have loop.
 * 1) for loop
 * 
 * 		iterate the loop until condition is not specified.
 * 	 
 *      in for loop first check condition of outer body then inner body but execute first inner body and then outer body
 * 
 * example of for loop		
 * 
 * 		int i;// specify variable data type
 * 
 * 		for(i=0; i<n; i++) 
 * 			1) i=0 --> variable initialize		
 * 			2) i<n --> condition
 * 			3) update expression
 * 
 * 
 * 2) while loop :- entry control loop
 * 				
 * 		while loop is  first  check condition after execute block of statment.	
 * 
 * example of while loop
 * 
 * 		int i//specify variable data type
 * 
 * 		while(i=0)	//variable initialize
 * 		{
 * 			i<n; 	//condition
 * 			i++;	//update expression
 * 		}
 * 
 * 3) do-while loop :- exit control loop
 * 
 * 		do-while loop is first execute bloack of code after check condition whether condition is false at least once is execute.	
 * 
 * example of do-while loop 
 * 
 * 		int i //specify variable data type 
 * 
 * 		do
 * 			{
 * 			i<n;	//condition
 * 			i++;	//update expression
 * 			}
 * 		while(i=0)	//variable initialize
 * 		
 */

//basic for loop programme to execute numeric no 1 to 5
/*
package topic;

public class loop {
	public static void main(String[] args) {
		int i;
		for(i=1; i<=5;i++)
		{
			System.out.println(i);	
		}
	}

}
*/
//example of pattern programme to print * 
//*
//**
//***
//****

/*
package topic;

public class loop {
	public static void main(String[] args) {
		int i,j;
		for(i=0; i<5;i++)
		{
			for(j=0; j<=i;j++)
			{
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	}

}
*/
/*
package topic;

public class loop{

	public static void main(String[] args) {
		
		for(int i = 0;i<10;i++)
		{
			for(int sp =0;sp<10-i;sp++) // printing space
			{
				System.out.print(" ");
			}
			
			for(int j =i;j<=i;j++)    // printing star
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
}
*/

//create pyramid using for loop

package topic;

import java.util.Scanner;

//public class loop
//{
//	public static void main(String[] args) {
//		int i,j,row=5;
//		for(i=1; i<=row;i++)
//		{
//			for(j=1;j<=i;j++)
//			{
//				System.out.print(j+"  ");
//			}
//			System.out.println(" ");
//		}
//	}
//}

/*
public class loop
{
	public static void main(String[] args) {
		int higher='E',lower='A';
		
		for(int i=1; i<=(higher - 'A'); i++)
		{
			for(int j=1; j <=i; j++)
			{
				System.out.print(lower+ "");
			}
			++lower;
			System.out.println("");
		}
		
	}
}
*/

/*
public class loop{
	public static void main(String[] args) {
		int i,j,row=5;
		for(i=row; i>=1; i--)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(j+"");
			}
			System.out.println("");
		}
		
	}
}

*/

/*
public class loop{
	public static void main(String[] args) {
		int k=0,rows=5;
		for(int i=1; i<=rows;i++)
		{
			for(int sp=1; sp<=rows-i; sp++)
			{
				System.out.print(" ");
			}
			for( k=0; k!=2*i-1; k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
*/
/*
public class loop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a;
		System.out.println("enter charcter that describe value is vowel or not");
		a=(sc.next()).charAt(0);
				
		switch(a)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("vowel");
			break;
		default:
			System.out.println("constant");
			break;
		}
			
	}
}

*/
/*
public class loop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		char ch;
		while(i<5) {
		int no1,no2,ans;
		System.out.println("welcome");
		
		System.out.println("enter no1");
		no1 = sc.nextInt();
		System.out.println("select operator like + - * /");
		ch = sc.next().charAt(0);
		System.out.println("enter no 2");
		no2 = sc.nextInt();
		
		
		switch(ch)
		{
		case '+':
			ans=no1+no2;
			System.out.println("no1 and no2 addition is\t"+ans);
			break;
		case '-':
			ans = no1 - no2;
			
			
			System.out.println("no1 and no2 addition is\t"+ans);
			break;
		case '*':
			ans = no1 - no2;
			System.out.println("no1 and no2 addition is\t"+ans);
			break;
		case '/':
			ans = no1-no2;
			System.out.println("no1 and no2 addition is\t"+ans);
			break;
		default:
			System.out.println("enter wrong symbol");
			i++;
		}
	}
}

}
*/

































































































