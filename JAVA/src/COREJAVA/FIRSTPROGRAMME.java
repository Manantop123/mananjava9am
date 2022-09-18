package COREJAVA;

class demo
{
	void show()
	{
		System.out.println("show method");
	}
}
public class FIRSTPROGRAMME {
	public static void main(String[] args) {
		demo d1 = new demo();
		d1.show();
		System.out.println("call in main method");
	}
}
