import java.util.*;
public class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int x = sc.nextInt();
		double y = Math.sqrt(x); //Math.sqrt() is used to find square root && use double
		System.out.println("The square root of " +x+ " is "+y);
	}

}
