import java.util.*;
class p4
{
	public static void main(String[] args)
	{
		int n,rev=0,a;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int originalN = n;
		while(n!=0)
		{
			a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		if(rev==originalN)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}
}