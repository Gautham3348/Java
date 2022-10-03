/*
 * Final KeyWord is used in -
 *  1.class(The class can not be inherited if we use final at class)
 *  2.methods(The method can not be overriden by another method if we use final)
 *  3.variables(The variable value cannot be changed if we use final at variable)
 */

final class I //in class
{
	public void show()
	{
		System.out.println("I am I");
	}
}
class J
{
	public final void show() //in method
	{
		System.out.println("I am J");
	}
}
public class FinalKeyword 
{
	public static void main(String[] args)
	{
		final int i = 10; //in variable
		
	}
}
