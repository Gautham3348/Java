# Java
public class Multilevinherit 
{
	public static void main(String[] args) 
	{
		Calcm obj = new Calcm();
		System.out.println(obj.add(5,4));
		System.out.println(obj.sub(5, 4));
		System.out.println(obj.mul(5, 4));
		
	}

}

class Calc
{
	public static int add(int a,int b)
	{
		int c = a+b;
		return c;
	}
}
class Calcs extends Calc
{
	public static int sub(int a, int b)
	{
		int d = a-b;
		return d;
	}
}
class Calcm extends Calcs
{
	public static int mul(int a,int b)
	{
		int e = a*b;
		return e;
	}
}
