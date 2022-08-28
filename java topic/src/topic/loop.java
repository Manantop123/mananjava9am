/*
 * there are three types have loop.
 * 1) for loop
 * 
 * 		iterate the loop until condition is not specified.
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

package topic;

public class loop {
	public static void main(String[] args) {
		int i,j;
		//outer loop for rows
		for(i=0; i<5;i++)
		{
			//loop for spaces
			for(j=0; j<(5-i); j++)
			{
				System.out.print("");
			}
			//inner loop for columns
			for(j=0; j<=i;j++)
			{
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	}

}
