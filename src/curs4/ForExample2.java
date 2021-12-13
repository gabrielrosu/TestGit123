package curs4;

import java.util.Scanner;

public class ForExample2 {

    // program care intreaba user-ul un caracter si apoi un numar
    // va lua caracterul si va printa atatea linii si coloane cate sunt date in numar

    public static void main(String[] args) {
        char caracter;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un caracter :");
        caracter = scan.next().charAt(0);
        System.out.println("Introduceti un numar :");
        num = scan.nextInt();

        for (int i=0; i<num; i++){
            for(int j = 0; j<num; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }

    }
}
