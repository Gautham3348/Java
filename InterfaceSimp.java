interface Robot
{
	void show(); //No need to use public abstract(our choice) in interface &
	             //If we declare a variable in interface it becomes constant.
}

class Chitti implements Robot
{
	public void show()
	{
		System.out.println(" Hi! My Name is Chitti");
		System.out.println("Speed - 1Tera Byte , Memory - 1Zeta Byte");
	}
}
public class InterfaceSimp 
{
	public static void main(String[] args)
	{
		Robot obj = new Chitti();
		obj.show();
	}
}
