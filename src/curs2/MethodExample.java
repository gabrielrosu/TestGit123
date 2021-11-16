package curs2;

public class MethodExample {

    /*
    * 1. numar de camere dinamic
    * 2. calcul al fiecarei camere
    * 3. nr total de mp
    */
    int area;

    public static void main (String[] args){
        //fara metode
        //room1
        int length = 4;
        int width = 2;
        int room1Area = length*width;
        System.out.println("Aria camerei 1 este " + room1Area);
        //room2
        int length2 = 5;
        int width2 = 2;
        int room2Area = length2*width2;
        System.out.println("Aria camerei 2 este " + room1Area);

        int nrTotalMp = room1Area + room2Area;
        System.out.println("Total Mp pentru cele 2 camere: " + nrTotalMp);

        MethodExample room = new MethodExample();
        MethodExample room2 = new MethodExample();

        int hol = room.calculateArea(4, 2);
        System.out.println("Calcul aria camerei 1 prin metoda " + hol);
        int baie = room2.calculateArea(5, 2);
        System.out.println("Calculul ariei camerei 2 prin metoda " + baie);

        System.out.println("Total MP prin metoda " + calculeazaNrTotalMp(hol, baie));

    }

    public int calculateArea(int length, int width){
        return length*width;
    }

    public static int calculeazaNrTotalMp(int...rooms){
        int result = 0;
        for(int room : rooms){
            result = result + room;

        }

        return result;
    }
}
