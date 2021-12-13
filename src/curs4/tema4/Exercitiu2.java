package curs4.tema4;

import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {
        int num;
        System.out.println("Please enter a number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
