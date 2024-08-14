import java.util.*;
class Vol
{
    int length;
    int width;
    int depth;
    void Vol()
    {
        System.out.print("The volume is "+length*width*depth);
    }
}
public class p12
{
     public static void main(String args[])
    {
        int l,b,d;
        Vol boxdemo=new Vol();
        System.out.println("Enter the dimensions");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        d=sc.nextInt();
        boxdemo.length=l;
        boxdemo.width=b;
        boxdemo.depth=d;
        boxdemo.Vol();
    }
}