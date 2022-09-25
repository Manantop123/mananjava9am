package COREJAVA;

/*
 *genric : it is a medicine. 
 * 			it provide common type to all type at runtime.
 * 			
 *java provide common type for refrence type and not for primitive type.
 *	
 *refrence type : class
 *
 *<E>
 */



public class genric {
	
	public static <E> void printArray(E[] inputArray)
	{
		for(E e : inputArray)
		{
			System.out.println(" "+e);
		}
	}
	
	public static void main(String[] args) {
		Integer intArray[] = {1,2,3,4,5};
		Double doubleArray[] = {1.1,2.2,3.3,4.4};
		Character charArray[] = {'A','B','C'};
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}
}
