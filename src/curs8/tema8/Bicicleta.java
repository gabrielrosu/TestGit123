package curs8.tema8;

public class Bicicleta extends Vehicul {

    public Bicicleta(String brand, int nivelPoluare, String vitezaMedie) {

        super(brand, nivelPoluare, vitezaMedie);
    }

    public String nume() {
        String nume = "BMX";
        return nume;
    }

    public String motorizare() {
        String motorizare = "eco";
        return motorizare;
    }

    public void detaliiVehicul() {
        System.out.println("Nivelul de poluare pentru " + getBrand() + " este :" + getNivelPoluare()
                + " si viteza medie atinsa este de " + getVitezaMedie());
    }


}
