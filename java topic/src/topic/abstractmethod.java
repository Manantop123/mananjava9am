

//abstraction means hiding internal feature. giving some other feature to access that feature.
//abstarction can be two types of
//	1)partial abstraction.- achieved through abstract class
//	2)complete abstraction - achived throgh interface.

//e.g. fan,air


//feature of abstract class

//--> abstarct class  contain abstarct method and non-abstarct method.
//--> we cannot create object of abstarct class.
//--> abstract method are just declaratin.they dont have body.
//--> when inherit abstract class,must be compolsury to implement abstract method in class which you are inheriting.


package topic;

abstract class M1{
	
	abstract void meth1();//abstarct method
	
	void meth2()//non-abstract method
	{
		System.out.println("non abstract method");
	}
	
}
class N1 extends M1{
	
	void meth3()
	{
		System.out.println("non abstract method meth3");
	}
	void meth1()
	{
		System.out.println("non-abstract method meth1");
	}
}
class O1 extends N1{
	void meth4()
	{
		System.out.println("non abstract method meth4");
	}
	void meth5()
	{
		System.out.println("non-abstract method meth5");
	}
}
public class abstractmethod {
	public static void main(String[] args) {
		O1 c = new O1();
		c.meth1();
		c.meth2();
		c.meth3();
		c.meth4();
		c.meth5();
	}
}





















