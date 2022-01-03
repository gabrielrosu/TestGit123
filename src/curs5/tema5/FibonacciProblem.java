package curs5.tema5;

public class FibonacciProblem {
    public static void main(String[] args) {
        //Structura For
        int[] sirFibonacciFor = new int[9];
        sirFibonacciFor[0] = 0;
        sirFibonacciFor[1] = 1;
        System.out.print("Structura While - Seria Fibonacci pentru 9 numere: " + sirFibonacciFor[0] + " " +  sirFibonacciFor[1] + " ");
        for (int i = 2; i < 9; i++) {
            sirFibonacciFor[i] = sirFibonacciFor[i - 2] + sirFibonacciFor[i - 1];
            System.out.print(sirFibonacciFor[i] + " ");
        }
//        System.out.print("Structura For - Seria Fibonacci pentru 9 numere: ");
//        for (int num : sirFibonacciFor) {
//            System.out.print(num + " ");
//        }
        System.out.print('\n');

        //Structura While
        int[] sirFibonacciWhile = new int[9];
        sirFibonacciWhile[0] = 0;
        sirFibonacciWhile[1] = 1;
        System.out.print("Structura While - Seria Fibonacci pentru 9 numere: " + sirFibonacciWhile[0] + " " +  sirFibonacciWhile[1] + " ");
        int a =2;
        while ( a<9){
            sirFibonacciWhile[a] = sirFibonacciWhile[a-2] + sirFibonacciWhile[a-1];
            System.out.print(sirFibonacciWhile[a] + " ");
            a++;
        }
    }
}
