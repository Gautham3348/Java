import java.util.Scanner;

public class AdditionByInput 
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int m = sc.nextInt();
		System.out.println("Enter another number :");
		int n = sc.nextInt();
		int a = m+n;
		System.out.println("The additon of two numbers is : "+a);
	
	}
}
