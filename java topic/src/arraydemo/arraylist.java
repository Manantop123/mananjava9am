/*
 * 
 * an array : store multiple elements of single type.
 * 
 * an arraylist : 
 * 
 * 			-->store multiple elements of multiple type.
 * 			-->array and arraylist both are start from 0 index.
 * 			-->in array list duplicate value are allowed.
 * 			-->it is dynamic.
 * 
 * notes :- arraylist is class which internally implemets interface &  extend abstract classes.
 * 		
 * 	
 * 
 */

package arraydemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("hello world");
		al.add(null);
		al.add(12.35);
		al.add(true);
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.indexOf(12.35));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(3));
		System.out.println(al.set(3,100));
		System.out.println(al);
		
		System.out.println("iterator");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------------listiterator");
		ListIterator lir = al.listIterator();
		while(lir.hasNext())
		{
			System.out.println(lir.next());
		}
		System.out.println("-----------reverse  listiterator");
		while(lir.hasPrevious())
		{
			System.out.println(lir.previous());
		}
	}
}
