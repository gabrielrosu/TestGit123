package curs3.tema3;

import java.util.Scanner;

public class Varsta {
    int vrs;

    public void intreabaVarsta(){
        System.out.println("Ce varsta ai?");
        Scanner scan = new Scanner(System.in);
        vrs = scan.nextInt();
    }

    public void verificaVarsta() {
        if (vrs < 18) {
            System.out.println("Esti minor");
        } else if (vrs >= 18 && vrs <= 65) {
            System.out.println("Esti adult");
        } else {
            System.out.println("Esti batran");
        }
    }

    public static void main(String[] args) {
        Varsta obj = new Varsta();
        obj.intreabaVarsta();
        obj.verificaVarsta();
    }
}
