package curs9.tema9;

import java.util.Scanner;

public class TestSavingsAccount {
    public static void main(String[] args) throws InsufficientFundsException {
    Customer customer = new Customer("Gabi", "Bucuresti", "gabi@gmail.com");
    SavingsAccount savingsAccount = new SavingsAccount(customer,10562.51, 112293);
        System.out.println("Hi " + customer.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount to withdraw");
        double sumaRetragere = scanner.nextDouble();
        try {
                savingsAccount.withdraw(sumaRetragere);
                System.out.println("Please pick your money!");
                System.out.println("Your new balance is " + savingsAccount.balance);
        }
        catch(InsufficientFundsException e){
                System.out.println("The amount you entered is greater than the available balance :" + savingsAccount.balance);
                e.printStackTrace();
        }
        finally{
                System.out.println("Thank you for using our ATM!");
        }

    }
}
