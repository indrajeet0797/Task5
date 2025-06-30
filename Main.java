public class Main {
    public static void main(String[] args) {
        Account account = new Account("Mahammad Altaf", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
        account.deposit(-100);
        account.printTransactionHistory();
        System.out.println("Final Balance: " + account.getBalance());
    }
}