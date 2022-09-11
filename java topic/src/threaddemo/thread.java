package threaddemo;

/*
 * thread : is a smallest unit of programme.
 * 			It contain 3 argument.
 * 
 * 1) main : it means thread name.
 * 
 * 2) priority :
 * 
 * 	by default the value will be 5 remain.  i.e. norm_priority
 * 
 * 		min_priority :whos value is  1
 * 		norm_priority :whos value is  5
 * 		max_priority :whos value is  10
 * 
 * 3)group name :
 * 		by default it will belong to group name.
 */

public class thread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("my thread");
		System.out.println(t);
		t.setPriority(10);
		System.out.println(t);
		try {
		for(int i=0; i<5; i++)
		{
			System.out.println(t + ":"+i);
				Thread.sleep(1000);
			} 
		}
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("thread exiitng");
	}
}
