import java.util.*;
interface Employee {
    void getDetails();
}
interface Manager extends Employee 
{
    void getDeptDetails();
}
class Head implements Manager 
{
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;
    public Head(int empId, String empName, int deptId, String deptName) 
    {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }
    @Override
    public void getDetails()
    {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
    }
    @Override
    public void getDeptDetails() 
    {
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}
public class p25
{
    public static void main(String[] args)
    {
        int empId = 123;
        String empName = "Sidharth Ambani";
        int deptId = 06;
        String deptName = "Marketing";
        Head head = new Head(empId, empName, deptId, deptName);
        head.getDetails();
        head.getDeptDetails();
    }
}
