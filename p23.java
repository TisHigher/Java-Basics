import java.util.*;
interface Motor 
{
    int cap = 100;
    void run(int n);
    void consume(int x);
}
class WashingMachine implements Motor 
{
    public void run(int n) 
    {
        System.out.println("The running time of machine is " + n);
    }
    public void consume(int x) 
    {
        System.out.println("The machine consumes " + x);
    }
}
public class p23 
{
    public static void main(String args[]) 
    {
        WashingMachine W1 = new WashingMachine();
        W1.run(90);
        W1.consume(120);
    }
}
