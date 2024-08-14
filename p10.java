import java.util.*;
class p10
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
        for(int i=0;i<n;i++)
        {
            System.out.println("Occurence of "+arr[i]);
            int count=0;
            for(int j=i;j<n;j++)
            {
                if(arr[j]==arr[i])
                    count++;
            }
            System.out.print(count);
        }
    }
}