package curs8;

public class PrivateAccessModifier {

    /**
     * Scopul Private este limitat la clasa in care se afla
     * Clasa sau interfata nu pot fi declarate ca Private
     *
     * Aceeasi clasa: da
     * subclasa acelasi pachet : no
     * alta clasa acelasi pachet : no
     * subclasa in alt pachet : no
     * alta clasa in alt pachet : no
     */


    private static String mesaj = "Hello";
    public static String word = "there";

    public static String getMesaj() {
        return mesaj;
    }

    public static void setMesaj(String mesaj) {
        PrivateAccessModifier.mesaj = mesaj;
    }
}
