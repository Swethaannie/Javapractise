package assignment10;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee c1 = new Contractor("Arun", 101, 500, 6);
        Employee f1 = new FullTimeEmployee("Meera", 102, 800);

        System.out.println("Contractor Salary: " + c1.calculateSalary());
        System.out.println("Full Time Employee Salary: " + f1.calculateSalary());
    }
}
