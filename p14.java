import java.util.Scanner;
class Student 
{
    private int rollNo;
    private String name;
    private double cgpa;
    public Student(int rollNo, String name, double cgpa) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }
    public double getCGPA() 
    {
        return cgpa;
    }
    public String getName() 
    {
        return name;
    }
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", CGPA: " + cgpa;
    }
}
public class p14 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(rollNo, name, cgpa);
        }
        System.out.println("\nDetails of students:");
        for (Student student : students) {
            System.out.println(student);
        }
        double minCGPA = Double.MAX_VALUE;
        String lowestCGPAStudentName = "";
        for (Student student : students) {
            if (student.getCGPA() < minCGPA) 
            {
                minCGPA = student.getCGPA();
                lowestCGPAStudentName = student.getName();
            }
        }
        System.out.println("\nStudent with the lowest CGPA: " + lowestCGPAStudentName);
    }
}
