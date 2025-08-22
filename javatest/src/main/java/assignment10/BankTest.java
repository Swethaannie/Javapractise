package assignment10;

public class BankTest {
    public static void main(String[] args) {
        HDFCBank hdfc = new HDFCBank();
        double result = hdfc.recurringDeposit(10000, 2); // Rs.10,000 for 2 years
        System.out.println("Maturity Amount after 2 years: " + result);
    }
}