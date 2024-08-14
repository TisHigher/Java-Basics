interface Employee 
{
    double earnings(double basicSalary);
    double deductions(double basicSalary);
    double bonus(double basicSalary);
}
abstract class Manager implements Employee 
{
    @Override
    public double earnings(double basicSalary) {
        double DA = 0.8 * basicSalary;
        double HRA = 0.15 * basicSalary;
        return basicSalary + DA + HRA;
    }
    @Override
    public double deductions(double basicSalary) {
        return 0.12 * basicSalary; // PF deduction
    }    
}
class Substaff extends Manager 
{
    @Override
    public double bonus(double basicSalary) 
    {
        return 0.5 * basicSalary;
    }
}
public class p24 {
    public static void main(String[] args) 
    {
        double basicSalary = 50000;
        Substaff substaff = new Substaff();
        double earnings = substaff.earnings(basicSalary);
        double deductions = substaff.deductions(basicSalary);
        double bonus = substaff.bonus(basicSalary);
        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
    }
}
