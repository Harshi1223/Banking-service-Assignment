public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("00011", 1000, 5);
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 2000, 1000);

        BankServices bankServices = new BankServiceImpl();
        bankServices.openAccount();

        savingsAccount.deposit(500);
        savingsAccount.calculateInterest();
        savingsAccount.displayBalance();

        checkingAccount.withdraw(1500);
        checkingAccount.displayBalance();

        bankServices.transferFunds(savingsAccount, checkingAccount, 200);
        savingsAccount.displayBalance();
        checkingAccount.displayBalance();

        bankServices.closeAccount();
    }
}
