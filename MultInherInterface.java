interface Cow
{
	default void cow()
	{
		System.out.println("I can walk");
	}
}
interface Fish
{
	default void fish()
	{
		System.out.println("I can swim");
	}
}
interface Eagle
{
	default void eagle()
	{
		System.out.println("I can fly");
	}
}
class Man implements Cow, Fish, Eagle
{
	public  void man()
	{
		System.out.println("I can so anything with machines");
	}
}
public class MultInherInterface 
{
	public static void main(String[] args)
	{
		Man obj = new Man();
		obj.cow();
		obj.fish();
		obj.eagle();
		obj.man();
	}
}
