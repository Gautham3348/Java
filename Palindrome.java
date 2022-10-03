import java.util.*;
public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int rem, sum=0, a;
		a=n;
		while(n>0)
		{
			rem = n%10;
			sum = sum *10+rem;
			n=n/10;
		}
		if(a==sum)
		{
			System.out.println(a+" is a palindrome number");
		}
		else
		{
			System.out.println(a+" is not a palindrome number");
		}
	}
}
