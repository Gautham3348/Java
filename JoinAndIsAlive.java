/*
 * join() - The join is used to join the statement after the execution of 
 * Thread
 * isAlive() - The useAlive is used weather the Thread is alive(running) or 
 * not
 */

public class JoinAndIsAlive
{
	public static void main(String[] args) throws Exception //for not
	                                   //solving an error in t1 and t2.join();
	{
		Thread t1 = new Thread (() -> 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hi");
				try { Thread.sleep(500);}catch(Exception e) {}
			}
		});
		Thread t2 = new Thread(() ->
				{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(500);}catch(Exception e) {}
			}
				});
		t1.start();
		{
		try {Thread.sleep(10);}catch(Exception e) {}
		}
		t2.start();
		
		t1.join();//This method waits the joining of t1
		t2.join();//This method waits the joining of t2
		System.out.println(t1.isAlive()); //isAlive()
		System.out.println("Byee");//this statement was used after the join()
	}
}
