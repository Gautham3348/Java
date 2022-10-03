
public class ExcepWithMultCatch 
{
	public static void main(String[] args)
	{
		try
		{

			int a = 10/4; //ArithmeticException
			System.out.println("a : "+a);
			
			int b[] = new int[5]; //ArrayIndexOutOfBoundsException
			b[5] = 8;
			
			int c[] = null; //NullPointerException
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You are crossing limits");
		}
		catch(Exception e) //No need to mention NullPointer because it last
		                   // catch block
		{
			System.out.println("This is error");
		}
		finally
		{
			System.out.println("Nice Try");
		}
	}

}
