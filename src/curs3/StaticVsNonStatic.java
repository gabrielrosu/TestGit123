package curs3;

public class StaticVsNonStatic {

    //Instance area
    public String nume = "Rosu ";
    public String printeazaMesaj(){
        return "Salut " + nume;
    }

    //end of instance area


    //static area
    public static String prenume = "Gabi";
    public static String printeazaMesajStatic(){
        return "Hello static " + prenume;
    }
    //end of static area


    public static void main (String[] args){
        StaticVsNonStatic obj = new StaticVsNonStatic();
        System.out.println("Numele meu este " + obj.nume + prenume);
        System.out.println(printeazaMesajStatic());
        System.out.println(obj.printeazaMesaj());

    }
}
