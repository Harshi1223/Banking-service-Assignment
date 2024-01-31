interface BankServices {
    void openAccount();
    void closeAccount();
    void transferFunds(BankAccount fromAccount, BankAccount toAccount, double amount);
}
