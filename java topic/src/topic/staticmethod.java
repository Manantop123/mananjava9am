package topic;



public class staticmethod {
	static  int a =10;
	static int b;
	
	static void meth(int x)
	{
		System.out.println("x is"+x);
		System.out.println("a is"+a);
		System.out.println("b is"+b);
	}
	
	{
		System.out.println("block is called");
	}
	static
	{
		System.out.println("static is initialized");
		b=a*4;
	}
	static
	{
		System.out.println("block2 is initialized");
		a=b*2;
	}
	{
		System.out.println("block 2 is called");
	}
	
	public static void main(String[] args) {
		meth(12);
	}
	
}
