import java.util.*;
class p6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("The largest among these numbers is:");
		if(a>=b&&a>=c)
			System.out.println(a);
		else if(b>=a&&b>=c)
			System.out.println(b);
		else
			System.out.println(c);
	}
}