package curs6;

import java.util.Random;

public class ArrayExample2 {

    public final int LENGHT = 6;
    public final int MAX_NUMBERS = 9;

    public static void main(String[] args) {

        /**
         * Facem un program care genereaza numere random si le tine intr-un array
         * dupa printam array-ul
         * facem un search in array
         */
    ArrayExample2 ex = new ArrayExample2();

    ex.printNumbers(ex.generateNumbers());


    }

    public int[] generateNumbers(){
        int[] numbers = new int[LENGHT];
        Random random = new Random();
        int randomNr;
        for (int i =0; i<LENGHT; i++){
            do {
                randomNr = random.nextInt(MAX_NUMBERS);
            }while (existaNrInArray(numbers, randomNr));
            numbers[i]=randomNr;
        }

        return numbers;
    }

    public void printNumbers(int[] arr){
        for (int nrr : arr) {
            System.out.print(nrr + " | ");
        }
    }

    public boolean existaNrInArray(int[] array, int nrToSearchFor){
        for (int value : array ) {
            if (nrToSearchFor == value){
                return true;
            }
        }
        return false;
    }
}
