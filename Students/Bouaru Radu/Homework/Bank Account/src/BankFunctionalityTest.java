
public class BankFunctionalityTest {

	public static void main(String[] args) {
		Bank newBank = new Bank();
		newBank.createAccounts();
		
		Account x = newBank.openAccount(1, 40);
		x.deposit(50);
		System.out.println("Before cash dividend payment: ");
		newBank.showAccountInformation();
		newBank.payDividends(10000, 0.5);
		System.out.println("After cash dividend payment: ");
		newBank.showAccountInformation();
	}

}
