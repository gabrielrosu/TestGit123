package curs5;

import java.util.Scanner;

public class ForVsWhile {
    public static void main(String[] args) {
        rezolvareCuWhile();
    }

    public static void rezolvareCuWhile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int x = scan.nextInt();
        int sum=0;
        while (x !=0){
            sum+=x;
            System.out.println("Please enter a number :");
            x = scan.nextInt();
        }
        System.out.println("Total sum of entered numbers is :" + sum);
    }

    public static void rezolvareCuFor(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a number :");
        int sum = 0;
        for(int i=scan.nextInt(); i!=0; i=scan.nextInt()){
            sum+=i;
            System.out.println("Please enter a number :");
        }
        System.out.println("Total sum of entered numbers is :" + sum);
    }
}
