
public class SavingsAccount extends Account{

	public SavingsAccount(int number) {
		super(number);
	}

	private double interestRate = 1;
	private int investmentLength = 1;
	private int timesCompounded = 3;
	
	private double setInterest()
	{
		double currentMoney  = super.getBalance();
		//Using compound interest
		double newInterest;
		
		newInterest = (Math.round(Math.pow(currentMoney * (1.0 + interestRate/(double)timesCompounded), timesCompounded*investmentLength))*100)/100.0;
		
		return newInterest;
	}

	@Override
	public void deposit(double newSum)
	{
		if(super.getBalance() != 0.0)
		super.deposit(setInterest());
		else
			super.deposit(newSum);
	}

}
