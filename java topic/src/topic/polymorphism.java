//polymorphism
//
//poly means many
//morpism means forms
//
//there are two types of poly-morphism.
//1)compile time  -- method overloading
//2)run-time  --  method overriding.

package topic;

class methodoverloading
{
	int add(int a,int b)
	{
		return a+b;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class polymorphism {
	public static void main(String[] args) {
		methodoverloading mo = new methodoverloading();
		System.out.println("the value of int 2 add is"+mo.add(2,2,2));
		System.out.println("the value of float 2 add is"+mo.add(2.0f,2.0f));
		System.out.println("the value of int 3 add is"+mo.add(2,2,3));
	}
}
