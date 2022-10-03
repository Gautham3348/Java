//MultiTasking = Doing multiple tasks at a time
//MultiThreading = doing many sub processes for one task at a time
//Using of Thread two ways :-
/*1.by extending the Thread & 2. By implementing the Runnable
 * if use runnable we create the object of a Thread
 */
// By extending the Thread
class Hai extends Thread // to access Thread functions
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
class Hello extends Thread // to access Thread functions
{
	public void run() //runnable method
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try          
			{
				Thread.sleep(1000);//need to write in exception handling method
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
		}
	}
}
public class MultiThreadingEx 
{
	public static void main(String[] args)
	{
		Hai obj1 = new Hai();
		Hello obj2 = new Hello();
		obj1.start(); //starts the obj1 methods execution
		obj2.start(); //starts the obj2 methods execution
	}
}
