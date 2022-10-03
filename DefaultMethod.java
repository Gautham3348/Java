interface Default1
{
	default void show1()
	{
		System.out.println("Consistency is the key to success");
	}
	default void show2()
	{
		System.out.println("What you do today can improve all tommorows");
	}
}
class Default2 implements Default1
{
	public void show3()
	{
		System.out.println("Great things take time");
	}
}
public class DefaultMethod 
{
	public static void main(String[] args)
	{
		Default2 obj = new Default2();
		obj.show1();
		obj.show2();
		obj.show3();
	}
}
