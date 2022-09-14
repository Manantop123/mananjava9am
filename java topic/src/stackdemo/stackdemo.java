/*
 * stackdemo :
 * 				It follow lifo.(last in first out)
 * 
 */

package stackdemo;

import java.util.Stack;

public class stackdemo {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(10.24);
		st.push("manan");
		st.push(10);
		st.push(null);
		st.push(true);
		
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.pop());
	}
	
}
