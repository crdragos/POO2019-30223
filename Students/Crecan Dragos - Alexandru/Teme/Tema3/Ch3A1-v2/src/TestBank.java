public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("La deschiderea bancii aveam " + bank.getNrConturi() + " conturi.");

        Account account1 = new Account(1);
        Account account2 = new SavingsAccount(2);
        Account account3 = new CurrentAccount(3);
        Account account4 = new SavingsAccount(4);

        bank.openAccount(account1);
        bank.openAccount(account2);
        bank.openAccount(account3);
        bank.openAccount(account4);

        System.out.println("Acum in banca se afla : " + bank.getNrConturi() + " conturi.");

        System.out.println();
        System.out.println("Iniante de plata dividentelor: ");
        for (int i = 0; i < bank.getNrConturi(); i++) {
            bank.getAccount(i).print();
        }

        bank.payDividente(100);

        System.out.println();
        System.out.println("Dupa plata dividentelor: ");
        for (int i = 0; i < bank.getNrConturi(); i++) {
            bank.getAccount(i).print();
        }

        System.out.println();
        System.out.println("Inainte de update: ");
        for(int i = 0; i < bank.getNrConturi(); i++) {
            bank.getAccount(i).print();
        }

        bank.update(200);

        System.out.println();
        System.out.println("Dupa update: ");
        for (int i = 0; i < bank.getNrConturi(); i++) {
            bank.getAccount(i).print();
        }

        System.out.println();
        System.out.println("Dupa inchiderea contului cu numarul 1: ");
        bank.closeAccount(account1);
        for (int i = 0; i < bank.getNrConturi(); i++) {
            bank.getAccount(i).print();
        }

    }
}
