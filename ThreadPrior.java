/*
 * getName() - It is used to get the name of the Thread
 * setName() - It is used to set the new name of the Thread
 * getPriority() - Gives the current Priority 
 * setPriority() - Set the new Priority value 	
 */
public class ThreadPrior
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread (() -> 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hi");
				try { Thread.sleep(500);}catch(Exception e) {}
			}
		}, "Hai Thread"); //Giving the name of Thread
		Thread t2 = new Thread(() ->
				{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(500);}catch(Exception e) {}
			}
				}, "Hello Thread");
		
		System.out.println(t1.getName()); //prints Hai Thread . def Thread-0
		t1.setName("First Thread"); //Another way of giving name of the Thread
		System.out.println(t1.getName()); //prints First Thread
		
		t1.setPriority(Thread.MIN_PRIORITY); //or we can give any number(1)
		t2.setPriority(Thread.MAX_PRIORITY); // or we can give any number(10)
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		{
		try {Thread.sleep(10);}catch(Exception e) {}
		}
		t2.start();
	}
}
