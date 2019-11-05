
public class Bank {
	private Account[] account = new Account[10];
	private int nrConturi;
	
	public Bank(Account[] account, int nrConturi) {
		this.account = account;
		this.nrConturi = nrConturi;
	}
	
	public int getNrConturi() {
		return this.nrConturi;
	}
	
	public Account getAccount(int index) {
		return this.account[index];
	}
	
	public void openAccount(Account account) {
		this.account[nrConturi] = account;
		nrConturi++;
	}
	
	public void closeAccount(Account account) {
		int index = 0;
		for (index = 0; index < this.nrConturi; index++) {
			if (this.account[index].getAccountNumber() == account.getAccountNumber()) {
				this.account[index].withdraw(this.account[index].getBalance());
				break;
			}
		}
		for (int i = index; i < this.nrConturi; i++) {
			this.account[i] = this.account[i + 1];
		}
		this.nrConturi--;
	}
	
	public void payDividente(double suma) {
		for (int i = 0; i < this.nrConturi; i++) {
			this.account[i].deposit(suma);
		}
	}
	
	public void updateAccount(double suma) {
		SavingsAccount auxSavingsAccount = new SavingsAccount(1,5);
		CurrentAccount auxCurrentAccount = new CurrentAccount(1,5);
		
		for (int i = 0; i < this.nrConturi; i++) {
			if (this.account[i].getClass() == auxSavingsAccount.getClass()) {
				this.account[i].deposit(suma);
			} else if (this.account[i].getClass() == auxCurrentAccount.getClass()) {
				this.account[i].withdraw(suma);
				// nu merge conversia
			}
		}
	}
	
	
	
	
}
