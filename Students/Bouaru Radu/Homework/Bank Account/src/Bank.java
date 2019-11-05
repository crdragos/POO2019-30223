import java.util.Random;

public class Bank {
	private Account[] bankAccounts = new Account[20];

	public void createAccounts() {

		int i = 0;
		while (i < bankAccounts.length) {
			Random randomizeAccounts = new Random();
			if (randomizeAccounts.nextInt(3) == 0) {
				bankAccounts[i] = new SavingsAccount(i);
				bankAccounts[i].deposit(Math.round((Math.abs(randomizeAccounts.nextDouble() * 100) * 100)) / 100.0);
				i++;
			} else if (randomizeAccounts.nextInt(3) == 1) {
				bankAccounts[i] = new CurrentAccount(i);
				bankAccounts[i].deposit(Math.round((Math.abs(randomizeAccounts.nextDouble() * 100) * 100)) / 100.0);
				i++;
			} else if (randomizeAccounts.nextInt(3) == 2) {
				bankAccounts[i] = new Account(i);
				bankAccounts[i].deposit(Math.round((Math.abs(randomizeAccounts.nextDouble() * 100) * 100)) / 100.0);
				i++;
			}
		}
	}

	public void showAccountInformation() {
		for (int i = 0; i < bankAccounts.length; i++)
			System.out.println("Account no.: " + Math.round(bankAccounts[i].getAccountNumber()) + " balance: "
					+ bankAccounts[i].getBalance());
	}

	public void updateAccounts() {
		for (int i = 0; i < bankAccounts.length; i++)
			if (bankAccounts[i] instanceof SavingsAccount) {
				bankAccounts[i].deposit(10);
			} else if (bankAccounts[i] instanceof CurrentAccount) {
				if (bankAccounts[i].getBalance() > ((CurrentAccount) bankAccounts[i]).getOverdraftLimit()) {
					System.err.println("Account " + i + ", you are in overdraft!");
				}
			}
	}

	public Account openAccount(int chooseAccount, int accountNumber) {
		if (chooseAccount == 1) {
			Account newAccount = new Account(accountNumber);
			return newAccount;
		} else if (chooseAccount == 2) {
			SavingsAccount newAccount = new SavingsAccount(accountNumber);
			return newAccount;
		} else if (chooseAccount == 3) {
			CurrentAccount newAccount = new CurrentAccount(accountNumber);
			return newAccount;
		} else
			return null;
	}

	public void closeAccount(int accountNumber) {
		bankAccounts[accountNumber].withdraw(bankAccounts[accountNumber].getBalance());
		System.out.println("We hope you enjoyed our services!");
	}

	public void payDividends(double totalShares, double dividendPerShare) {
		double dividendPayout = totalShares * dividendPerShare;
		for (int i = 0; i < bankAccounts.length; i++)
			bankAccounts[i].deposit(dividendPayout);
	}

}
