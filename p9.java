import java.util.*;
class p10
{
public class ObjectCounter 
{
    private static int objectCount = 0;
    public ObjectCounter() 
    {
        objectCount++;
        System.out.println("Object created! New count: " + objectCount);
    }
    public static void displayObjectCount() 
    {
        System.out.println("Total objects created: " + objectCount);
    }

    public static void main(String[] args) 
    {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter.displayObjectCount();
    }
    private static int validateInput() {
        Scanner scanner = new Scanner(System.in);
        int inputCount;

        do {
            System.out.print("Enter the desired number of objects: ");
            inputCount = scanner.nextInt();
        } while (inputCount <= 0);

        return inputCount;
    }
}
}