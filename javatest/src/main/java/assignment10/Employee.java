package assignment10;

abstract class Employee {
    String name;
    int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Abstract method
    abstract double calculateSalary();
}
