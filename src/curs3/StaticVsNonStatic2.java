package curs3;

public class StaticVsNonStatic2 {

    public String nume;
    public static String departament = "QA";




    public static void main(String[] args) {

        StaticVsNonStatic2 person = new StaticVsNonStatic2();
        person.nume = "Rosu ";
        System.out.println(person.nume + departament);

        //obiect 2
        StaticVsNonStatic2 person2 = new StaticVsNonStatic2();
        person2.nume = "Gabi ";
        System.out.println(person2.nume + departament);

        departament ="DEV";
        //obiect3
        StaticVsNonStatic2 person3 = new StaticVsNonStatic2();
        person3.nume = "Trei ";
        System.out.println(person3.nume + departament);

        System.out.println("------------------------");
        System.out.println(person.nume + departament);
        System.out.println(person2.nume + departament);
        System.out.println(person3.nume + departament);
    }
}
