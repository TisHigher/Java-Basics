import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter dividend:");
            int dividend = scanner.nextInt();
            System.out.println("Enter divisor:");
            int divisor = scanner.nextInt();
            
            // Division operation
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            scanner.close(); // Closing the scanner
        }
    }
}
