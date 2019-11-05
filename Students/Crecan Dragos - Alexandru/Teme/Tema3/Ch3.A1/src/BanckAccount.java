
public class BanckAccount {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1);
		
		acc1.deposit(15);
		System.out.println(acc1.getAccountNumber());
		System.out.println(acc1.getBalance());
		acc1.withdraw(50);
		System.out.println(acc1.getBalance());
		
		SavingsAccount acc2 = new SavingsAccount(1,5);
		acc2.addInterest();
		System.out.println(acc2.getBalance());
		acc2.addInterest();
		acc2.addInterest();
		System.out.println(acc2.getBalance());
		acc2.setInterest(15);
		acc2.addInterest();
		System.out.println(acc2.getBalance());
		
		CurrentAccount acc3 = new CurrentAccount(1,0);
		acc3.setOverdraft(7);
		acc3.deposit(50);
		System.out.println(acc3.getBalance());
		System.out.println(acc3.getBalance());
		acc3.withdraw(10);
		acc3.withdraw(30);
		System.out.println(acc3.getBalance());
		acc3.withdraw(30);
		
		
		Account[] conturi = new Account[10];
		for (int i = 0; i < 5; i++) {
			if ( i == 0) {
				conturi[i] = new Account(2);
			} else if (i % 2 == 0) {
				conturi[i] = new SavingsAccount(1,5);
			} else {
				conturi[i] = new CurrentAccount(1,0);
			}
		}
		
		Bank myBank = new Bank(conturi, 5);
		CurrentAccount newCurrentAccount = new CurrentAccount(1,0);
		myBank.openAccount(newCurrentAccount);
		
		System.out.println("Inainte de plata dividentelor: ");
		for (int i = 0; i < myBank.getNrConturi(); i++) {
			System.out.println("Contul " + i + " are " + myBank.getAccount(i).getBalance());
		}
		
		myBank.closeAccount(myBank.getAccount(0));
		System.out.println();
		System.out.println("Dupa plata acestora: ");
		myBank.payDividente(15);
		for (int i = 0; i < myBank.getNrConturi(); i++) {
			System.out.println("Contul " + i + " are " + myBank.getAccount(i).getBalance());
		}
		
	}

}
