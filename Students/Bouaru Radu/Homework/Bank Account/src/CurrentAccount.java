
public class CurrentAccount extends Account {

	private int overdraftLimit;

	public CurrentAccount(int number) {
		super(number);
	}

	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public int getOverdraftLimit() {
		return this.overdraftLimit;
	}
	
	@Override
	public void withdraw(double sum) {
		if (sum > 0) {
			if ((super.getBalance() - sum < 0)) {
				if (Math.abs(super.getBalance()) + sum < overdraftLimit) {
					super.balance -= sum;
					System.out.println("You have negative balance in your account");
				} else
					System.out.println("Cannot withdraw anymore. Limit: " + overdraftLimit);

			}
		} else {
			System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
		}
	}

}
