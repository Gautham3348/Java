/*
 * Three types of the interfaces :
 * 1.Normal interface (It has more than one abstract method)
 * 2.Functional interface(Single abstract interface) (It has only one abstract method)
 * 3.Marker interface (It has no methods)
 */
@FunctionalInterface 
/*
 * This is called an annotational. This is not mandatory 
 * but when we use this annotational called Functional-
 * Interface allows us do not insert more than one method
 * because functionlalinterface means having only one method 
 */
interface FuncInterface
{
	void ucan();
}
public class FuncInterf 
{
	public static void main(String[] args)
	{
		FuncInterface obj = () -> System.out.println("Nothing is impossible");
		// We can create like this using lambda expression(->)
		//It is only applicable to FunctionalInterface
		obj.ucan();
	}
}
