public class SavingsAccount extends Account{
    private double interests;

    public SavingsAccount(int number) {
        super(number);
        this.interests = 10;
    }

    public void setInterests(double interests) {
        this.interests = interests;
    }

    public double getInterests() {
        return this.interests;
    }

    public void addInterests(double interests) {
        this.deposit(interests);
    }

    @Override
    public String toString() {
        return "Savings Account " + getAccountNumber() + " balance : " + getBalance() + "; interests : " + getInterests();
    }
}
