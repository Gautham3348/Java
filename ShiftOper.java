
public class ShiftOper 
{
	public static void main(String[] args)
	{
		int a = 10;   //1010
		int b = a<<2; //1010 + 2bits = 101000 = 40
		int c = a>>2; //1010 - 2bits = 10 = 2
		System.out.println("b : " +b);
		System.out.println("c : " +c);
	}
}
