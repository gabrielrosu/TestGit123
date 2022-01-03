package curs5;

import java.util.Scanner;

public class DoWhileExample2 {
    public static void main(String[] args) {

        /**
         * introducem numere si le inmultim cu 10
         * printam rezultatul
         * cand introducem 0 oprim executia
         */
        int num ;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter a number :");
            num = scan.nextInt();
            System.out.println(num*10);
        }while (num!=0);
    }
}
