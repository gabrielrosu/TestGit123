package curs1;

public class WageCalculator {

    int nrOreLucrate = 40;

    public  static void main(String[] args){
        Tester tester1 =new Tester();
        tester1.setNume("Gabi");
        tester1.setRatePerHour(40);
        tester1.setAge(28);
        System.out.println("Tester1 este " + tester1.getNume());


        Tester tester2 =new Tester();
        tester2.setNume("Bogdan");
        tester2.setRatePerHour(65);
        tester2.setAge(25);
        System.out.println("Tester2 este " + tester2.getNume());

        WageCalculator calc = new WageCalculator();
        System.out.println("Salariul lui " + tester1.getNume() + " este " + calc.calculeazaSalariu(tester1.getRatePerHour()));
        System.out.println("Salariul lui " + tester2.getNume() + " este " + calc.calculeazaSalariu(tester2.getRatePerHour()));
        System.out.println(tester1.getNume() + " are: " + tester1.getAge() + " ani! ");
        System.out.println(tester2.getNume() + " are: " + tester2.getAge() + " ani! ");
    }

    public int calculeazaSalariu(int rateHourly){

        int salariu =nrOreLucrate * rateHourly;
        return salariu;
    }
}
