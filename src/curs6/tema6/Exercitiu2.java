package curs6.tema6;

public class Exercitiu2 {
    public static void main(String[] args) {
        String text = "Eu invat Java";
        char[] myArray = new char[text.length()];
        for (int i =0; i<text.length(); i++) {
           myArray[i] = text.toLowerCase().charAt(i);
        }
        int nrVocale = 0;
        for (char ch : myArray){
            if ( ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u'){
                nrVocale++;
            }
        }
        System.out.println("Vocale:nr de vocale din text este: " + nrVocale);
    }
}
