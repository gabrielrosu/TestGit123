package curs8;

    class DefaultAccesModifier {

    /**
     * daca nu mentionam niciun access modifier se considera default
     * Scopul lui este limitat la pachetul in care se afla
     *
     * Same class: da
     * Subclass in acelasi pachet : da
     * Alta clasa in acelasi pachet : da
     *
     * Subclasa in alt pachet : nu
     * Alta clasa in alt pachet : nu
     */

    String mesaj;

    void printMesaj(){
        System.out.println("Default modifier");
    }

    public static void main(String[] args) {

    }
}
