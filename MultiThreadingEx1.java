//By extending the Thread(printing the values by order)
class Hai1 extends Thread 
{
	public void run() // runnable method
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hai");
			try //use the Exception Handling becoz it causes exception
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
class Hello1 extends Thread // to access Thread functions
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
				System.out.println("error");//no need to write this line 
			}
		}
	}
}
public class MultiThreadingEx1
{
	public static void main(String[] args)
	{
		Hai1 obj1 = new Hai1();
		Hello1 obj2 = new Hello1();
		obj1.start(); 
		try          //just to make to Hai prints first
		{              //it makes to print the hai before the hello by 10 msec
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		obj2.start(); 
	}
}
