package curs7;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
       // factorial(5);
        System.out.println(factorial2(5));
    }

    public static void factorial(int num){
        int fac = 1;
        for (int i=1; i<=num; i++){
            fac = fac*i;
        }
        System.out.println(fac);
    }

    public static int factorial2(int num2){
        if (num2 == 1)
        {
            return 1;
        }
        else {
            return factorial2(num2-1)*num2;
        }
    }
}
