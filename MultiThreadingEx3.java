//By using the anonymous class and lamda expression.
public class MultiThreadingEx3 
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
	}
}
