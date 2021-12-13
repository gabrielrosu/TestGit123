package curs4;

public class BitwiseOperator {

    public static void main(String[] args) {
        /**
         * && --> short circuit
         * & --> and
         *
         * (x!=0)&(x>5) --> evalueaza (x!=0) dupa evalueaza (x>5) dupa aceea aplica conditia &
         *
         * (x!=0)&&(x>5) --> evalueaza (x!=0) daca este TRUE evalueaza (x>5)
         *
         * a | b --> evalueaza A dupa evalueaza B dupa aceea face |
         * a || b -> evalueaza A
          */

        int x = 0;
        if ((x!=0)&(x>5)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
