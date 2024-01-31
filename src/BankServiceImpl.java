class BankServiceImpl implements BankServices {
    public void openAccount() {
        System.out.println("Account opened successfully");
    }

    public void closeAccount() {
        System.out.println("Account closed successfully");
    }

    public void transferFunds(BankAccount fromAccount, BankAccount toAccount, double amount) {
        if (fromAccount.balance >= amount) {
            fromAccount.balance -= amount;
            toAccount.balance += amount;
            System.out.println("Funds transferred successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}