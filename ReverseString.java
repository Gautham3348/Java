import java.util.*;

public class ReverseString 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name to get reverse :");
		String s = sc.nextLine();
		int len = s.length();
		String rev = "";
		for(int i = len-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
