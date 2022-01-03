package curs5;

import java.util.Scanner;

public class WhileLoopExample3 {
    public static void main(String[] args) {
        //ce stim
        int maxAllowedHoursWorked = 40;
        int ratePerHours = 15;

        //ce nu stim
        System.out.println("Care ore ai lucrat saptamana aceasta ? :");
        Scanner scan = new Scanner(System.in);
        int hoursWorked = scan.nextInt();

        //validarea
        while (hoursWorked > maxAllowedHoursWorked || hoursWorked < 1){
            System.out.println("Numar invalid de ore!");
            System.out.println("Introdu un numar valid de ore care sa fie mai mic decat 40 :");
            hoursWorked = scan.nextInt();
        }
        System.out.println("Salariul de plata este : " +hoursWorked*ratePerHours);
    }
}
