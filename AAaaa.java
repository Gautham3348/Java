import java.util.*;
class Hello
{
	private int rollno;
	private String name;
	public void setRollno(int rn)
	{
		rollno = rn;
	}
	public int getRollno()
	{
		return this.rollno;
	}
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return this.name;
	}
}
public class AAaaa
{
	public static void main(String[] args)
	{
		Hello obj = new Hello();
		obj.setRollno(59);
		obj.setName("Gowtham");
		int x = obj.getRollno();
		String y = obj.getName();
		System.out.println(x);
		System.out.println(y);
	}

}


