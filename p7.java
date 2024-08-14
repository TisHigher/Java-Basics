import java.util.*;
class p7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers you want to store:");
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The odd numbers:");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
                System.out.println(arr[i]);
        }
        System.out.println("The even numbers:");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
                System.out.println(arr[i]);
        }
    }
}