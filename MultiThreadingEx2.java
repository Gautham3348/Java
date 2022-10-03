//By implementing the Runnable
class Hai2 implements Runnable
{
	public void run() // runnable method
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hai");
			try
			{
				Thread.sleep(1000); //in milliseconds
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
		}
	}
}
class Hello2 implements Runnable
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try          
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
		}
	}
}
public class MultiThreadingEx2
{
	public static void main(String[] args)
	{
		Hai1 obj1 = new Hai1();
		Hello1 obj2 = new Hello1();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start(); 
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		t2.start(); 
	}
}
