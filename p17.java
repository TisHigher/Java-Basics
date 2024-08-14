import java.util.Scanner;
class Rectangle 
{
    double length;
    double breadth;
    Rectangle() 
    {
        length = 0;
        breadth = 0;
    }
    Rectangle(double length, double breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }
    double calculateArea() 
    {
        return length * breadth;
    }
}
public class p17 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Area of rectangle with default dimensions: " + rectangle1.calculateArea());
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        Rectangle rectangle2 = new Rectangle(length, breadth);
        System.out.println("Area of rectangle with user-defined dimensions: " + rectangle2.calculateArea());
        scanner.close();
    }
}
