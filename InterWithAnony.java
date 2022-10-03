 
interface My
{
	void show();
}

public class InterWithAnony 
{
	public static void main(String[] args)
	{
		My obj = new My()
				{
			public void show()
			{
				System.out.println("Hi! My name is Gowtham");
			}
				};
			obj.show();
	}
}