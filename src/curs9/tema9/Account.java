package curs9.tema9;

public abstract class Account {
    private int accountNumber;
    public double balance;
    Customer accountOwner;

    public Account(Customer accountOwner, double balance, int accountNumber) {
        this.accountOwner = accountOwner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public abstract void withdraw(double sumaRetragere) throws InsufficientFundsException;
}
