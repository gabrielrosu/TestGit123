package curs4;

public class IncrementDecrement {

    public static void main(String[] args) {
        //num1++ --> post increment
        //num1 = num1+1
        //++num1 --> pre increment

        int num1 = 10;
        System.out.println("Valoarea lui num1 inainte de increment :" + num1);
        System.out.println("Valoarea lui num1 in post increment :" + num1++);
        System.out.println("Valoarea lui num1 dupa post de increment :" + num1);
        System.out.println("Valoarea lui num1 in pre increment :" + ++num1);

        int num2 = 10;
        System.out.println("Valoarea lui num2 in pre increment :" + ++num2);
        System.out.println("Valoarea lui num2 dupa pre increment :" + num2);

        int num3 = 5;
        num3++; //num3 = 6
        ++num3;
        int num4 = num3 + 1;
        System.out.println(num4);
    }
}
