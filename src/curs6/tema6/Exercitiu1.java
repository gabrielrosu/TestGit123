package curs6.tema6;

import java.util.Scanner;

public class Exercitiu1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti 10 numere: ");
        for (int i=0; i<10; i++){
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }
        System.out.println("Suma numerelor din array este: " + sum);
    }
}
