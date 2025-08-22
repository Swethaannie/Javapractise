package assignment10;

class Contractor extends Employee {
    double paymentPerHour;
    int workingHours;

    public Contractor(String name, int empId, double paymentPerHour, int workingHours) {
        super(name, empId);
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
    }

    @Override
    double calculateSalary() {
        return paymentPerHour * workingHours;
    }
}