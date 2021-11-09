package curs1;

public class WageCalculator {

    int nrOreLucrate = 40;

    public  static void main(String[] args){
        Tester tester1 =new Tester();
        tester1.setNume("Gabi");
        tester1.setRatePerHour(40);
        System.out.println(tester1.getNume());


        Tester tester2 =new Tester();
        tester2.setNume("Bogdan");
        tester2.setRatePerHour(65);
        System.out.println(tester2.getNume());

        WageCalculator calc = new WageCalculator();
        System.out.println("Salariul lui " + tester1.getNume() + " este " + calc.calculeazaSalariu(tester1.getRatePerHour()));
        System.out.println("Salariul lui " + tester2.getNume() + " este " + calc.calculeazaSalariu(tester2.getRatePerHour()));
    }

    public int calculeazaSalariu(int rateHourly){

        int salariu =nrOreLucrate * rateHourly;
        return salariu;
    }
}
