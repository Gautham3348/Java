class Anony
{
	public void show()
	{
		System.out.println("Hi! Hello");
	}
}
public class AnonymousClass 
{
	public static void main(String[] args)
	{
		Anony obj = new Anony()
		{
		  public void show()
		  {
		  	System.out.println("Hi! There");
		  }
		};
		obj.show();
	}
}