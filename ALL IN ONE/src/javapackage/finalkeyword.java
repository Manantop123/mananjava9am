package javapackage;

//finalkeyword is if you declare variable as final then u cannot change and also need to assign compoulsory.

//if declare method as final then method cannot be overriden.

//if declare class as final then you cananot inherit that class.

class final1{
	final int a = 10;
	
	final void show()
	{
		System.out.println("value of a is"+a);
	}
}
class final2 extends final1{
	//
}
public class finalkeyword {
	public static void main(String[] args) {
	final2 f1 = new final2();
	f1.show();
}
}


