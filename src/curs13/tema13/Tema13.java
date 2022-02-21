package curs13.tema13;

public class Tema13 {

   public static String textTema = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo," +
            " eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim." +
            " Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue." +
            " Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";

    public static void main(String[] args) {
        System.out.println("Prima metoda");
        System.out.println(countWords(textTema, "Nulla"));
        System.out.println("A doua metoda");
        spargeInPropozitii(textTema);
        System.out.println("A treia metoda");
        stergeLitera(textTema, 'a');
        System.out.println("A patra metoda");
        inlocuiesteLitera(textTema, 'o', '#');
    }

    public static int countWords (String text, String cuvantulCautat){
        int nrOfWords = 0;
        String[] listaCuvinte = text.split(" ");
        for (String cuvant:listaCuvinte) {
        if (cuvant.equals(cuvantulCautat)) {
            nrOfWords++;
            }
        }
        return nrOfWords;
    }

    public static void spargeInPropozitii (String text){
        String[] listaPropozitii = text.split("\\.");
        for (String propozitie:listaPropozitii) {
            System.out.println(propozitie + ".");
        }
    }

    public static void stergeLitera(String text, char litera){
        StringBuilder sb = new StringBuilder(text);
        String s = String.valueOf(litera);
        while (sb.indexOf(s) != -1){
        sb.deleteCharAt(sb.indexOf(s));
        }
        System.out.println(sb.toString());
    }

    public static void inlocuiesteLitera (String text, char litera, char caracterNou){
        StringBuilder sb = new StringBuilder(text);
        String s = String.valueOf(litera);
        String nouaValoare = String.valueOf(caracterNou);
        int index = sb.indexOf(s);
        while (index != -1){
            sb.replace(index, index+1, nouaValoare);
            index = sb.indexOf(s);
        }
        System.out.println(sb.toString());
    }
}
