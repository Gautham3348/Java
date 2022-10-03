import java.util.*;
public class PrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int a=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				a = a+1;
			}

		}
		if(a>0)
		{
			System.out.println(n+ " is not a prime Number");
		}
		else
		{
			System.out.println(n+ " is a Prime Number");
		}
	}
}
