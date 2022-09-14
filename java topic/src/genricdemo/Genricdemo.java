/*
 * genricdemo : it provide common type for all datatype at runtime.
 * 				
 * REFRENCE TYPE class <E>
 */
package genricdemo;


public class Genricdemo {
	public static <E> void prinatarray(E[] arraylist)
	{
		for(E e : arraylist)
		{
			System.out.print(" " + e);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer inarray[] = {1,2,3,4,5,6};
		String stringarry[] = {"manan","manav"};
		Double floatarray[] = {1.1,2.2,3.3,4.4};
		
	}
}
