import java.util.Scanner;
class Rect 
{
    private double l;
    private double b;

    public void read() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        l=scanner.nextDouble();
        System.out.print("Enter breadth: ");
        b=scanner.nextDouble();
    }
    public void calculate() 
    {
        double a=l*b;
        double p=2*(l+b);
        display(a,p);
    }
    public void display(double a, double p) {
        System.out.println("Area of the rectangle: " +a);
        System.out.println("Perimeter of the rectangle: " +p);
    }
}

public class p13 
{
    public static void main(String[] args) 
    {
        Rect rectangle = new Rect();
        rectangle.read();
        rectangle.calculate();
    }
}
