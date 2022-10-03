interface Demo
{
	static void show()
	{
		System.out.println("Hi! There");
	}
}
public class StaticInInterf 
{

	public static void main(String[] args) 
	{
		Demo.show();//we are not create Demo object  but we can call it like 
		            //an object because we can call an static method by using
		            //the interface name
	}

}
