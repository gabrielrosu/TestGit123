package curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu un numar: ");
            int num1 = scanner.nextInt();

            System.out.println("Introdu alt numar: ");
            int num2 = scanner.nextInt();
            System.out.println(num1/num2);
        }catch (ArithmeticException e){
            System.out.println("Catch block");
            System.out.println("Nu poti sa imparti la zero");
            //e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Te rog sa introduci doar numere");
        }catch (Exception e){
            System.out.println("Ceva a mers gresit!");
        }
    }
}
