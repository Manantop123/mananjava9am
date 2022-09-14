/*
 * 
 * hashmap :
 * 			!) it internally uses map function.
 * 			!!)it works with key and value.
 * 			!!!)one key can contain one value pair.
 * 			!v)every key is unique.
 * 			V)it works like hashset.
 * 			vii)it maintain insertion order.
 * 
 */

package hashmapdemo;

import java.util.HashMap;

public class hashmapdemo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "jack");
		hm.put(3, "jane");
		hm.put(6, "jack");
		hm.put(7, "jane");
		hm.put(4, "josh");
		hm.put(2, "jill");
		hm.put(5, "buttler");
		
		System.out.println(hm);
	}
}
