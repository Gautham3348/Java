import java.util.*;
public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		for(int i=n-1;i>0;i--)
		{
			n=n*i;
		}
		System.out.println("The factorial of the number is "+n);
	}

}
