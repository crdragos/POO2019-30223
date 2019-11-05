
public class CurrentAccount extends Account {
	private double overdraft;
	
	public CurrentAccount(int number, int overdraft) {
		super(number);
		this.overdraft = overdraft;
	}
	
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	public double getOverdraft() {
		return this.overdraft;
	}
	
	public void withdraw(double sum) {
		if (sum < 0) {
			System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
		}
		
		double sumOfMoney = super.getBalance();
		if (sumOfMoney - sum > this.overdraft) {
			super.withdraw(sum);
		} else {
			System.err.println("Account.withdraw(...): OVERDRAFT!");
		}
	}
}
