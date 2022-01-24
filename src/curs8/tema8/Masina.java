package curs8.tema8;

public class Masina extends Vehicul {

    public Masina(String brand, int nivelPoluare, String vitezaMedie) {
        super(brand, nivelPoluare, vitezaMedie);
    }

    public String nume() {
        String nume = "Duster";
        return nume;
    }

    public String motorizare() {
        String motorizare = "2.0";
        return motorizare;
    }

    public void detaliiVehicul() {
        System.out.println("Nivelul de poluare pentru masina " + getBrand() + " este :" + getNivelPoluare()
                + " si viteza medie atinsa este de " + getVitezaMedie());
    }

}
