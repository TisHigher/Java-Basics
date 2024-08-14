import java.util.*;
class p11
{
    public static void main(String args[])
    {
        int rightsum=0,leftsum=0;
        Scanner sc=new Scanner(System.in);
        int m[][]=new int[3][3];
        System.out.println("Enter the elements");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                    leftsum=leftsum+m[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(j==2-i)
                    rightsum=rightsum+m[i][j];
            }
        }
        System.out.println("Left sum is "+leftsum);
        System.out.println("Right sum is "+rightsum);
    }
}