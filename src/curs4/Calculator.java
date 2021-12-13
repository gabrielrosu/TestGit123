package curs4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    int num1, num2;
    char operator;
    int rezultat;


     //intreba utilizatorul valorile
    public void intreabaUtilizatorul(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Te rog sa introduci primul numar :");
        num1 = scan.nextInt();
        System.out.println("Te rog sa alegi operatorul :");
        operator = scan.next().charAt(0);
        System.out.println("Te rog sa introduci al doilea numar :");
        num2 = scan.nextInt();
    }

    //calculam pe baza valorilor

    public void calculeazaValorile(){
        if(operator == '+'){
            rezultat = num1 + num2;
            printRezultat();
        }
        else if (operator == '-'){
            rezultat = num1 - num2;
            printRezultat();
        }
        else if (operator == '*' || operator == 'x'){
            rezultat = num1 * num2;
            printRezultat();
        }
        else if (operator == '/'){
            rezultat = num1 / num2;
            printRezultat();
        }else {
            System.out.println("Operator invalid! Te rog sa folosesti unul dintre: '+', '-', '*', '/' ");
        }
    }

    public void printRezultat(){
        System.out.println(num1 + " " + operator + " " + num2 + " = " + rezultat);
    }

}
