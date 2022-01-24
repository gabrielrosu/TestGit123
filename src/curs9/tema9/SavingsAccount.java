package curs9.tema9;

public class SavingsAccount extends Account{

    @Override
    public void withdraw(double sumaRetragere) throws InsufficientFundsException {

           if (sumaRetragere > balance) {
               throw new InsufficientFundsException("Insufficient funds for transaction");
           } else {
               balance -= sumaRetragere;
           }
    }

    public SavingsAccount (Customer accountOwner, double balance, int accountNumber){
        super(accountOwner, balance, accountNumber);
    }
}
