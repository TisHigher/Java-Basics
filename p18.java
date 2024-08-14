import java.util.*;
class TwoD 
{
    double length;
    double width;
    TwoD(double l, double w)
    {
        length = l;
        width = w;
    }
    double area() 
    {
        return length * width;
    }
}
class ThreeD extends TwoD 
{
    double height;
    ThreeD(double l, double w, double h) 
    {
        super(l, w);
        height = h;
    }
    double volume() 
    {
        return length * width * height;
    }
}
public class p18 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimensions for 2D sheet (length and width):");
        double length2D = scanner.nextDouble();
        double width2D = scanner.nextDouble();
        TwoD sheet = new TwoD(length2D, width2D);
        System.out.println("Enter dimensions for 3D box (length, width, and height):");
        double length3D = scanner.nextDouble();
        double width3D = scanner.nextDouble();
        double height3D = scanner.nextDouble();
        ThreeD box = new ThreeD(length3D, width3D, height3D);
        double cost2D = sheet.area() * 40;
        double cost3D = box.volume() * 60;
        System.out.println("Cost of 2D sheet: Rs " + cost2D);
        System.out.println("Cost of 3D box: Rs " + cost3D);
    }
}
