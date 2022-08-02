import java.util.Scanner;

public class inputdata {
	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A value :");
		a = sc.nextInt();
		System.out.println("enter B value");
		b = sc.nextInt();
		System.out.println("ans addition"+(a+b));
		System.out.println("ans substraction"+(a-b));
		System.out.println("ans devision"+((float)a/(float)b));
		System.out.println("ans multiplication"+(a*b));

	}
	
}