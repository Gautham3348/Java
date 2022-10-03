interface Human
{
	void eat(); //No need to use public abstract(our choice) in interface
	// An interface must have abstract method where as abstract class as their choice
}
class Men implements Human
{
	public void eat()
	{
		System.out.println("I am men");
	}
}
class Women implements Human
{
	public void eat()
	{
		System.out.println("I am women");
	}
}
class General
{
	public void dosomething(Human g)
	{
		g.eat();
	}
}
 public class Inter
{
	public static void main(String[] args)
	{
		General g = new General();
		Human mn = new Men();
		Human wm = new Women();
		g.dosomething(mn);
	}
}

