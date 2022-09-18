package COREJAVA;

/*
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1 
 * 5 4 3 2 1
 * 
 
//Left triangle pattern

public class loopdemo {
	public static void main(String[] args) {
		int no_of_rows = 5;
		for(int i=1; i<=no_of_rows; i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
*/
/*
//Right triangle pattern

public class loopdemo
{
	public static void main(String[] args) {
		int no_of_rows = 5;
		for(int i=1; i<no_of_rows; i++)
		{
			for(int j=2*(no_of_rows-i); j>0; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
*/
//inverse parameter

public class loopdemo
{
	public static void main(String[] args) {
		int no_of_rows = 5;
		for(int i = 1; i<no_of_rows; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int x =1;x<no_of_rows-i; x++)
			{
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}























