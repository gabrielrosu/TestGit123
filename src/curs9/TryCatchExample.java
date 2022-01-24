package curs9;

import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu un numar: ");
            int num1 = scanner.nextInt();

            System.out.println("Introdu alt numar: ");
            int num2 = scanner.nextInt();
            System.out.println(num1/num2);
        }catch (Exception e){
            System.out.println("Catch block");
            e.printStackTrace();
        }
    }
}
