package topic;


class A1
{
	A1()
	{
		System.out.println("A cconstructor called");
	}
	void show()
	{
		System.out.println("show from a");
	}
	
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B constructor called");
	}
	void show()
	{
		super.show();
		System.out.println("show from b");
	}
}
class C1 extends B1{
	C1()
	{
		System.out.println("c constructor called");
	}
	void show()
	{
		super.show();
		System.out.println("show from c");
	}
}
public class constructorchaining {
	public static void main(String[] args) {
		C1 c = new C1();
		c.show();
	}
}
