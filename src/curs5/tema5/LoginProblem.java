package curs5.tema5;

import java.util.Scanner;

public class LoginProblem {
    public static void main(String[] args) {

        String validUserName = "TestUser";
        int validPassword = 1234;
        int i=3;
        int maxAttemps = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the UserName: ");
            String userName = scanner.next();
            System.out.println("Please enter the password: ");
            int pass = scanner.nextInt();
            if (userName.equals(validUserName) && pass==validPassword) {
                System.out.println("Login Successful");
                i = 1;
            }
            else {
                System.out.println("Login Error");
                maxAttemps++;
            }
            i--;
        }while ( i!=0);
        if(maxAttemps == 3) {
            System.out.println("Maximum attempts reached. User blocked");
        }
    }
}
