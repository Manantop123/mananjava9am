package topic;
//interface is similar like class. but it is not class.
//since it is not class.you cannot create object of class.
//in interface we will only abstract method.eg.default all method are abstract.
//it means,provide full abstraction.
//if you defining abstract method in interface. so you have must implement those method.
//use implement keyword in interface to use ineritance.
interface AA1
{
	void meth1();
}
interface BB1 
{
	void meth2();
}

class ABC implements AA1
{
	public void meth2()
	{
		System.out.println("meth2 abc");
	}
	public void meth1()
	{
		System.out.println("meth1 Abc");
	}
}
class XYZ implements BB1
{
	public void meth1()
	{
		System.out.println("meth1 xyz");
	}
	public void meth2()
	{
		System.out.println("meth2 Xyz");
	}
}

public class Interface 
{
	public static void main(String[] args) 
	{
		ABC a = new ABC();
		a.meth1();
		a.meth2();

		XYZ  c = new XYZ();
		c.meth1();
		c.meth2();
	}
}
