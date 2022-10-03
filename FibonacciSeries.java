import java.util.*;
public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n number of Fibonacci series :");
		int n = sc.nextInt();
		int fir=0, sec=1, next;
		for(int i=0;i<n;i++)
		{
			if(i<=1)
			{
				next = i;
			}
			else
			{
				next = fir+sec;
				fir=sec;
				sec=next;
			}
			System.out.print(" "+next);
		}
	}
}
