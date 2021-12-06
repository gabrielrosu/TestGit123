package curs3;

public class VariableScopeExample {

    //instance variable
    String prenume;

    public static void main(String[] args) {
        VariableScopeExample obj = new VariableScopeExample();
        obj.prenume = "Ceva";
        System.out.println(obj.prenume);

        System.out.println(obj.printeazaNume());
        System.out.println(obj.prenume);

    }


    public String printeazaNume(){
        String nume = "Valoare";
        prenume = "Altceva";
        return nume;
    }
}
