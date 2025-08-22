package assignment10;

class HDFCBank implements RBI {

    @Override
    public double recurringDeposit(double amount, int duration) {
        // Simple Interest Formula: A = P + (P * R * T)
        double maturityAmount = amount + (amount * interestRate * duration);
        return maturityAmount;
    }
}