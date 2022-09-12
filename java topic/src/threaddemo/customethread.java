/*
 * 	userdefine thread
 * 
 * there are two way to create user define thread.
 * 	1) the first way is to implementing the interface.
 * 		
 * 	=> when you creating your own thread by implementing interface , then it compoulsary to use a runnable interface.
 *  => so when you implement runnable interface, then you need to compulsory use run() method inside runnable interface.
 * 
 * 
 * 
 */

package threaddemo;

class NEWTHREAD implements Runnable {
	
	thread t;
	
	public NEWTHREAD() {
		t= new Thread(this,"child thread");
		t.S
	}




	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println(t+":"+i);
		}
		System.out.println("child thread existing");
	}
}

public class customethread
{
	public static void main(String[] args) {
		
	}
}