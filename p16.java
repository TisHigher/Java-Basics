import java.util.Scanner;

abstract class Shapes 
{
    abstract double area();
}

class Circle extends Shapes 
{
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() 
    {
        return Math.PI * radius * radius;
    }
}
class Triangle extends Shapes 
{
    double base, height;
    Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }
    @Override
    double area() 
    {
        return 0.5 * base * height;
    }
}

class Square extends Shapes 
{
    double side;
    Square(double side) 
    {
        this.side = side;
    }
    @Override
    double area() 
    {
        return side * side;
    }
}
public class p16
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter shape (circle/triangle/square): ");
        String choice = scanner.nextLine().toLowerCase();
        Shapes shape;
        switch (choice) 
        {
            case "circle":
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                System.out.println("Area of the circle: " + shape.area());
                break;
            case "triangle":
                System.out.print("Enter base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                System.out.println("Area of the triangle: " + shape.area());
                break;
            case "square":
                System.out.print("Enter side length of the square: ");
                double side = scanner.nextDouble();
                shape = new Square(side);
                System.out.println("Area of the square: " + shape.area());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
