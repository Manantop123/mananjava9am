import java.util.Scanner;

public class methoddemo {

	int a,b;
	
	Scanner sc = new Scanner(System.in);
	void getval()
	{
		
		System.out.println("enter a value");
		a = sc.nextInt();
		System.out.println("enter b value");
		b= sc.nextInt();
	}
	void showval()
	{
		
		System.out.println(("a value"+a));
		System.out.println(("b value"+b));
	}
		public static void main(String[] args) {
			
			methoddemo md = new methoddemo();
			md.getval();
			md.showval();
		}
		
}
