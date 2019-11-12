public class Bank {
    private Account[] accounts;
    private int nrConturi;

    public Bank() {
        this.accounts = new Account[10];
        this.nrConturi = 0;
    }

    public Account getAccount(int index) {
        return accounts[index];
    }

    public int getNrConturi() {
        return this.nrConturi;
    }

    public void openAccount(Account newAccount) {
        if (nrConturi < accounts.length) {
            accounts[nrConturi] = newAccount;
            nrConturi++;
        } else {
            System.err.println("Banca este plina, nu se pot efectua deschideri de conturi!");
        }
    }

    public void closeAccount(Account closedAccount) {
        int closedNumber = 0;

        for (int i = 0; i < nrConturi; i++) {
            if (this.accounts[i].getAccountNumber() == closedAccount.getAccountNumber()) {
                this.accounts[i].withdraw(accounts[i].getBalance());
                closedNumber = i;
                break;
            }
        }

        for (int i = closedNumber; i < nrConturi; i++) {
            this.accounts[i] = this.accounts[i + 1];
        }

        nrConturi--;
    }

    public void payDividente(double dividente) {
        for (int i = 0; i < nrConturi; i++) {
            this.accounts[i].deposit(dividente);
        }
    }

    public void update(double sum) {
        for (int i = 0; i < nrConturi; i++) {
            if (this.accounts[i] instanceof SavingsAccount) {
                ((SavingsAccount)this.accounts[i]).addInterests(sum);
            } else if (this.accounts[i] instanceof CurrentAccount) {
                ((CurrentAccount)accounts[i]).withdraw(sum);
            }
        }
    }
}
