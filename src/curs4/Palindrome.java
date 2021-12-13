package curs4;

public class Palindrome {

    public void checkIfWordIsPalindorme(String cuvant){
        // radar -> radar este la fel daca este citit de la dreapta la stanga sau de la stanga la dreapta


        String cuvantIntors ="";

        for(int i = cuvant.length()-1; i >= 0; i--){
            cuvantIntors = cuvantIntors + cuvant.charAt(i);
        }
        System.out.println("Cuvant original : " +cuvant);
        System.out.println("Cuvant intors : " +cuvantIntors);
        if (cuvantIntors.equals(cuvant)){
            System.out.printf("Cuvantul " + cuvant + " este palindrome");
        }else System.out.println("Cuvantul " + cuvant + " nu este palindrome");
    }
}
