package assignment10;

class FullTimeEmployee extends Employee {
    double dailyWage;

    public FullTimeEmployee(String name, int empId, double dailyWage) {
        super(name, empId);
        this.dailyWage = dailyWage;
    }

    @Override
    double calculateSalary() {
        return dailyWage * 8; // fixed 8 hours
    }
}