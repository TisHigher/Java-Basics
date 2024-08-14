import java.util.*;
class p28
{
    public static void main(String[]args)
    {
    try
    {
        int []a=new int[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<5;i++)
            System.out.print(a[i] );   
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Caught It");
    }
    }
}