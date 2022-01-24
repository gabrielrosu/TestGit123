package curs8.tema8;

public class TestVehicul {

    public static void main(String[] args) {

        Vehicul masina = new Masina("Dacia", 5, "180km/h");
        Vehicul bicicleta = new Bicicleta("Merida", 0, "25km/h");
        verificaMotorizarea(masina);
        verificaMotorizarea(bicicleta);
        masina.detaliiVehicul();
        bicicleta.detaliiVehicul();
    }

    public static void verificaMotorizarea(Vehicul vehicul) {
        System.out.println(vehicul.nume());
        System.out.println(vehicul.motorizare());
    }

}