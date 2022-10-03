/*
 * Exceptions :-
 * 1.try
 * 2.catch
 * 3.finally
 * why exception Handling :- If there was error at logic or some line(eg.first
 * line) the execution of that method may stops from the line. To over come
 * this, exception handling was introduced. If we use any exception handling
 * methods like try,etc.,, of that line or code it runs and if there was 
 * errors it prints the catch block statement else it prints the try block
 * statement
 */
public class ExceptionHandling
{
	public static void main(String[] args)
	{
		try//try block
		{
			int i=5/0; 
			System.out.println(i);
			//if there was error in this it go to catch & print 
		     //the statement in catch. if the logic is correct
	          //it shows the statement in the try.
		}
		catch(Exception e)//catch block
		{
			System.out.println("Error in the logic"); // we can also use 
                       	//the err in the place of out to be the output as red
			
		}
		finally  //finally block
		{
			System.out.println("Good Try");
			//whether the code is right or wrong not matters, The statement 
			// written in the finally block can execute later
		}
	}
}
