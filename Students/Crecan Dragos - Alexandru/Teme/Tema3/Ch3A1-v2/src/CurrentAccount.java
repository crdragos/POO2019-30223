public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int number) {
        super(number);
        this.overdraftLimit = 0;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    @Override
    public String toString() {
        return "CurrentAccount " + getAccountNumber() + " balance : " + getBalance() + "; overdraft limit : " + getOverdraftLimit();
    }

    @Override
    public void withdraw(double sum) {
        if (this.getBalance() - sum < this.overdraftLimit) {
            System.err.println("Extragere imposibila ==> depasire limita overdraft.");
        } else {
            super.withdraw(sum);
        }
    }

}
