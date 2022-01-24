package curs8;

public class ProtectedAccessModifier {

    /**
     * Scopul este in aceelasi pachet si subclase din pachete diferite
     * Clasele nu pot fi declarate ca protected
     *
     * Same class : yes
     * Subclass in same package : yes
     * Other class in same package : yes
     *
     * Subclass in other package : yes
     * Other class in other package : no
     */


    protected  String unu = "unu";

    protected  void printMesaj(){
        System.out.println("protected access");
    }

    public static void main(String[] args) {
        ProtectedAccessModifier obj = new ProtectedAccessModifier();
        obj.printMesaj();
    }
}
