package hashsetdemo;

import java.util.HashSet;

/*
 * hashset :- 
 * 
 * 			=>it internally implements set interface.
 * 			=>it internally uses hash function.
 * 			=>insertion order is not maintain.
 * 			=>no duplicate values are allowed.
 * 
 */
public class hashsetdemo {
	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add(10);
		h1.add("tops");
		h1.add(null);
		h1.add("t");
		h1.add(12.25);
		
		System.out.println(h1);
	}
}
