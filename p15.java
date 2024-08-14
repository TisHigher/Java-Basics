class Subtractor 
{
    public int subtract(int a, int b) 
    {
        return a - b;
    }
    public int subtract(int a, int b, int c) 
    {
        return a - b - c;
    }
    public double subtract(double a, double b) 
    {
        return a - b;
    }
    public int subtract(int[] nums) 
    {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) 
        {
            result -= nums[i];
        }
        return result;
    }
}
public class p15 
{
    public static void main(String[] args) 
    {
        Subtractor subtractor = new Subtractor();
        System.out.println("Subtracting 10 and 5: " + subtractor.subtract(10, 5));
        System.out.println("Subtracting 20, 10, and 5: " + subtractor.subtract(20, 10, 5));
        System.out.println("Subtracting 15.5 and 7.3: " + subtractor.subtract(15.5, 7.3));
        int[] nums = {30, 15, 5};
        System.out.println("Subtracting 30, 15, and 5 using array: " + subtractor.subtract(nums));
    }
}
