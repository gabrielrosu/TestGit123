package curs3;

public class CheckOddOrEven {
    int number;
    public void checkIfNumberIsOddOrEven(){
        if (number % 2 == 0) {
            System.out.println("Numarul " + number + " este par");
        }else{
            System.out.println("Numarul " + number + " este impar");
        }
    }

    public void askTheUserForANumber(){
        System.out.println("Te rog introdu un numar");
    }
}
